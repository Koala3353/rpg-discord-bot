package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class HelpCommand extends SlashCommand {
    public HelpCommand() {
        this.name = "help";
        this.help = "Get help on how to play the game";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        EmbedBuilder embed = new EmbedBuilder();
        embed.setAuthor("Help", null, event.getJDA().getSelfUser().getAvatarUrl());
        embed.setDescription("""
                ## Commands:
                1. </start:1274557989579133009> - Start your adventure
                2. </trade:1274534845397209118> - Commence a trade with a NPC
                3. </about:1274535935383703645> - Get information about the bot and the game
                4. </help:1274554226797973545> - Get help on how to play the game
                5. </profile:1274562534682132520> - View your profile
                6. </shop:1274562534682132521> - Visit the shop
                7. </inventory:1274562534682132522> - View your inventory
                8. </balance:1274563828658475040> - View your balance
                9. </equip:1274563828658475041> - Equip an item from your inventory
                """);
        embed.setColor(Color.decode("#4A2C6E"));
        embed.setFooter("How ABOUT looking at the START but never what happens AFTER?");
        event.replyEmbeds(embed.build()).setEphemeral(true).queue();
    }
}
