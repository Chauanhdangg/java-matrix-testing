package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathConfig {
    public Path getDatabasePath() {
        return Paths.get("storage", "database", "auction.db");
    }
}