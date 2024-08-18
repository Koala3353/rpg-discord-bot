package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class BalanceCommand extends SlashCommand {
    public BalanceCommand() {
        this.name = "balance";
        this.help = "View your balance";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Balance command is not implemented yet!").queue();
    }
}
