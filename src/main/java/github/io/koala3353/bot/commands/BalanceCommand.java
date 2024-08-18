package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;
import github.io.koala3353.bot.database.MongoDBPojo;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.time.OffsetDateTime;

public class BalanceCommand extends SlashCommand {
    public BalanceCommand() {
        this.name = "balance";
        this.help = "View your balance";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        long userId = event.getUser().getIdLong();
        // Get the balance of the user
        int balance = MongoDBPojo.getUser(userId).getBalance();

        EmbedBuilder embed = new EmbedBuilder();
        embed.setAuthor(event.getUser().getEffectiveName() + "'s Balance", null, event.getUser().getAvatarUrl());
        embed.setTimestamp(OffsetDateTime.now());
        embed.setDescription("You have <:shekels:906039266650505256> " + balance + " shekels\n\n" +
                "Use the shop to spend your shekels!\n" +
                "**Pro tip:** Start your adventure to earn more!");
        embed.setColor(Color.decode("#4A2C6E"));

        event.replyEmbeds(embed.build()).setEphemeral(true).queue();
    }
}
