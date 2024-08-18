package github.io.koala3353;

import github.io.koala3353.bot.Bot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Bot.class);

    public static void main(String[] args) {
        LOGGER.info("Starting program....");
        try {
            new Bot();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("Program started successfully!");
    }
}