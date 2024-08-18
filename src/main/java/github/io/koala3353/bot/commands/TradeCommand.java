package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class TradeCommand extends SlashCommand {
    public TradeCommand() {
        this.name = "trade";
        this.help = "Trade with another player";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Trade command is not implemented yet!").queue();
    }
}
