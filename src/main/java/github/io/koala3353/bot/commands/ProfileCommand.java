package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;
import github.io.koala3353.bot.database.MongoDBPojo;
import github.io.koala3353.bot.database.User;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfileCommand extends SlashCommand {
    public ProfileCommand() {
        this.name = "profile";
        this.help = "View your profile";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        long userId = event.getUser().getIdLong();
        User dbUser = MongoDBPojo.getUser(userId);
        int balance = dbUser.getBalance();
        int uniqueItemsOwned = dbUser.getItems().size();
        List<String> suitsSelected = dbUser.getSuit();
        String suitsSelectedString = String.join(", ", suitsSelected);
        boolean hasEscaped = dbUser.isEscaped();

        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setAuthor(event.getUser().getEffectiveName() + "'s Profile", null, event.getUser().getAvatarUrl());
        embedBuilder.addField("**Balance:**",  "<:shekels:906039266650505256> " + balance + " shekels", false);
        embedBuilder.addField("**Unique items owned:** ", uniqueItemsOwned + "", false);
        embedBuilder.addField("**Suits selected:** ", suitsSelectedString, false);
        embedBuilder.addField("**Has escaped:** ", hasEscaped ? "Yes" : "No", false);
        embedBuilder.setDescription("Check out your profile!");
        embedBuilder.setColor(Color.decode("#4A2C6E"));
        embedBuilder.setThumbnail(event.getJDA().getSelfUser().getAvatarUrl());
        embedBuilder.setTimestamp(OffsetDateTime.now());

        event.replyEmbeds(embedBuilder.build()).setEphemeral(true).queue();
    }
}
