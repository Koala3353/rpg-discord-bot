package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class AboutCommand extends SlashCommand {
    public AboutCommand() {
        this.name = "about";
        this.help = "Get information about the bot";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        EmbedBuilder aboutEmbed = new EmbedBuilder();
        aboutEmbed.setTitle("About the bot");
        aboutEmbed.setDescription("This bot is a simple bot created by Koala3353");
        aboutEmbed.setColor(Color.decode("#2A2E75"));

        event.reply("This bot is a simple bot created by Koala3353").queue();
    }
}
