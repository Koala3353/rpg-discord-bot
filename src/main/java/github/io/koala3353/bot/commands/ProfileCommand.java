package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class ProfileCommand extends SlashCommand {
    public ProfileCommand() {
        this.name = "profile";
        this.help = "View your profile";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Profile command is not implemented yet!").queue();
    }
}
