package github.io.koala3353;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    // Simple Config getter (.env file)
    private static final Dotenv dotenv = Dotenv.load();

    public static String get(String key) {
        return dotenv.get(key.toUpperCase());
    }
    public static long getLong(String key) {
        String config = dotenv.get(key.toUpperCase());
        if (config == null) return 0L;
        return Long.parseLong(config);
    }
}