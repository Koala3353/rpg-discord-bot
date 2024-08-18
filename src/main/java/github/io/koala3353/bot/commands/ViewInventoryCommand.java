package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class ViewInventoryCommand extends SlashCommand {
    public ViewInventoryCommand() {
        this.name = "inventory";
        this.help = "View your inventory";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        event.reply("Inventory command is not implemented yet!").queue();
    }
}
