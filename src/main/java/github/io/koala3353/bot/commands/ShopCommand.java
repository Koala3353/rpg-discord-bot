package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class ShopCommand extends SlashCommand {
    public ShopCommand() {
        this.name = "shop";
        this.help = "Buy items from the shop";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Shop command is not implemented yet!").queue();
    }
}
