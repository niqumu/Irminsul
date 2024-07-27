package io.irminsul.common.http;

/**
 * Represents a game region server
 * @param name The internal name of the region
 * @param title The display name of the region
 * @param ip The ip address to connect to for this region
 * @param port The port to connect to for this region
 */
public record DispatchRegion(String name, String title, String ip, int port) {
}
