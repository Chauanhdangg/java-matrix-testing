package org.example;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathConfig {
    public String getWindowsStylePath() {
        return "storage\\database\\auction.db";
    }
    public Path getMultiPlatformPath() {
        return Paths.get("storage", "database", "auction.db");
    }
}