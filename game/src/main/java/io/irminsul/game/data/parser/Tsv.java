package io.irminsul.game.data.parser;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple TSV parse/wrapper. Caution should be used when parsing extremely large files as file contents are kept in
 * memory. This could probably be rewritten later on to only read data as needed.
 */
@Getter
public class Tsv {

    /**
     * The file data is being read from
     */
    private final File file;

    /**
     * Logger
     */
    private final Logger logger;

    /**
     * A list of column names in the data
     */
    private final List<String> columns = new ArrayList<>();

    /**
     * The data itself, stored as a map. The first column is always assumed to be ID, and thus, rows are stored as
     * an ID -> values map, where values are themselves stored as a column name -> value map.
     */
    private final Map<Integer, Map<String, String>> data = new HashMap<>();

    /**
     * Create a new TSV wrapper for the provided file
     * @param file The TSV file to parse
     */
    public Tsv(@NotNull File file) {
        this.file = file;
        this.logger = LoggerFactory.getLogger("TSV Parser (" + file.getName() + ")");

        try {
            this.readFile();
            this.logger.info("Successfully read {} rows of data", this.data.size());
        } catch (Exception e) {
            this.logger.error("Failed to read input file: {}", e.toString());
        }
    }

    /**
     * Read and parse {@link Tsv#file}
     * @throws Exception If something went wrong reading the file, or if the TSV data is malformed in some way
     */
    private void readFile() throws Exception {
        List<String> lines = Files.readAllLines(this.file.toPath());

        // Parse header
        String header = lines.getFirst();
        this.columns.addAll(List.of(header.split("\t")));
        lines.removeFirst();

        // Parse the data itself
        lines.forEach(line -> {
            String[] split = line.split("\t");
            Map<String, String> values = new HashMap<>();

            // Sanitize input a bit
            for (int i = 0; i < split.length; i++) {
                if (split[i].isBlank()) {
                    split[i] = "0";
                }
            }

            // Read ID (first column)
            int id = Integer.parseInt(split[0]);

            // Read columns
            for (int i = 0; i < this.columns.size(); i++) {
                String column = this.columns.get(i);
                values.put(column, split[i]);
            }

            // Store data
            this.data.put(id, values);
        });
    }
}
