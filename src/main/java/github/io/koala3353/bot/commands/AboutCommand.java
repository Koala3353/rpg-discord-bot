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
        aboutEmbed.setDescription("""
                The RPG Discord bot made for Hack club's game jam with the theme of **loopholes**
                
                Greetings fellow adventurer! You are stuck in a mysterious time loop and the only way to get out is to find the mythical item called **The Hole**.
                
                Embark on a journey to go into a mysterious cave and find the treasure inside! But be careful, there are many dangers that await you! Will you go any deeper and get more rewards or take the cowards way out?
                
                Check out the commands here with </help:1274554226797973545> to get started!
                
                ### The Adventure's Code:
                - Look for an adventure! Type </start:1274557989579133009> to start your journey!
                - Open your imagination on how to defeat the monsters and get the treasure!
                - Once you defeat the monster, you will get a reward! You will have an option to exit the cave or go deeper!
                - Play with your friends and see who can get the most rewards and escape the time loop!
                - Have fun and trade your items.
                - Once you find **The Hole**, you will be able to escape the time loop!
                - Look for the loopholes in the game and exploit them to your advantage!
                - Enjoy the game and have fun! If you figure out a loophole, don't share it to others!
                
                This bot is made by [Koala3353](https://github.com/Koala3353) (Koala). The source code is available on [GitHub](https://github.com/Koala3353/rpg-discord-bot). It was made in Java using JDA and JDA-Utilities from August 18, 2024 to August 21, 2024.""");
        aboutEmbed.setColor(Color.decode("#4A2C6E"));
        aboutEmbed.setAuthor("About the bot", null, event.getJDA().getSelfUser().getAvatarUrl());
        aboutEmbed.setFooter("How it starts is better than how it ends");
        event.replyEmbeds(aboutEmbed.build()).setEphemeral(true).queue();
    }
}
