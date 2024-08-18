package github.io.koala3353.bot.commands;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;

public class EquipCommand extends SlashCommand {
    public EquipCommand() {
        this.name = "equip";
        this.help = "Equip an item from your inventory";
    }

    @Override
    protected void execute(SlashCommandEvent event) {
        // Equip the item
        event.reply("You have equipped the item").queue();
    }
}
