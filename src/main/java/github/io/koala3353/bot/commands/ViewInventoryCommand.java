package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;
import com.jagrosh.jdautilities.menu.ButtonEmbedPaginator;
import com.jagrosh.jdautilities.menu.Paginator;
import github.io.koala3353.bot.Bot;
import github.io.koala3353.bot.database.MongoDBPojo;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ViewInventoryCommand extends SlashCommand {
    public ViewInventoryCommand() {
        this.name = "inventory";
        this.help = "View your inventory";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Loading your inventory...").setEphemeral(true).queue();
        EmbedBuilder embed = new EmbedBuilder();
        embed.setAuthor(event.getUser().getEffectiveName() + "'s Inventory", null, event.getUser().getAvatarUrl());


    }
}
