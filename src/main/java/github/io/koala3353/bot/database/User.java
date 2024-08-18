package github.io.koala3353.bot.database;

import java.util.ArrayList;
import java.util.List;

public class User {
    long discord;
    List<UserItem> items;
    int balance;
    int loop;
    boolean escaped;
    List<String> suit;

    public User(long discord) {
        this.discord = discord;
        this.items = new ArrayList<>();
        this.balance = 0;
        this.loop = 0;
        this.escaped = false;
        this.suit = new ArrayList<>();
    }

    public User() {}

    public long getDiscord() {
        return discord;
    }

    public User setDiscord(long discord) {
        this.discord = discord;
        return this;
    }

    public List<UserItem> getItems() {
        return items;
    }

    public User setItems(List<UserItem> items) {
        this.items = items;
        return this;
    }

    public int getBalance() {
        return balance;
    }

    public User setBalance(int balance) {
        this.balance = balance;
        return this;
    }

    public int getLoop() {
        return loop;
    }

    public User setLoop(int loop) {
        this.loop = loop;
        return this;
    }

    public boolean isEscaped() {
        return escaped;
    }

    public User setEscaped(boolean escaped) {
        this.escaped = escaped;
        return this;
    }

    public List<String> getSuit() {
        return suit;
    }

    public User setSuit(List<String> suit) {
        this.suit = suit;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "discord=" + discord +
                ", items=" + items +
                ", balance=" + balance +
                ", loop=" + loop +
                ", escaped=" + escaped +
                ", suit=" + suit +
                '}';
    }
}
