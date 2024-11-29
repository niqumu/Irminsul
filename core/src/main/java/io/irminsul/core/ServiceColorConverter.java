package io.irminsul.core;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

@SuppressWarnings("unused")
public class ServiceColorConverter extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getLoggerName().equals("Irminsul Core")) {
            return "96"; // cyan
        } else if (iLoggingEvent.getLoggerName().equals("HTTP Server")) {
            return "92"; // green
        } else if (iLoggingEvent.getLoggerName().startsWith("Game Server")) {
            return "91"; // red
        } else if (iLoggingEvent.getLoggerName().startsWith("Plugin/")) {
            return "95"; // pink
        }

        return "37"; // white
    }
}
