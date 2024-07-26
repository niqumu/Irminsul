package io.irminsul.http.dispatch;

import lombok.Data;

public record DispatchRegion(String name, String title, String ip, int port) {
}
