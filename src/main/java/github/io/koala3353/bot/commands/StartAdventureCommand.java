package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class StartAdventureCommand extends SlashCommand {
    public StartAdventureCommand() {
        this.name = "start";
        this.help = "Start your adventure";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Start adventure command is not implemented yet!").queue();
    }
}
