package github.io.koala3353.bot.database;

import net.dv8tion.jda.api.entities.emoji.Emoji;

public class Item {
    String name;
    String description;
    String item_id;
    int cost;
    String emoji;

    public Item() {}

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getItem_id() {
        return item_id;
    }

    public Item setItem_id(String item_id) {
        this.item_id = item_id;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public boolean isBuyable() {
        return cost > 0;
    }

    public Item setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public Item setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    public Emoji getEmojiObject() {
        return Emoji.fromFormatted(this.emoji);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id='" + item_id + '\'' +
                ", cost=" + cost +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
