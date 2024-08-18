package github.io.koala3353.bot.database;

public class UserItem {
    int amount;
    String item;

    public UserItem() {}

    public int getAmount() {
        return amount;
    }

    public UserItem setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getItem() {
        return item;
    }

    public UserItem setItem(String item) {
        this.item = item;
        return this;
    }

    @Override
    public String toString() {
        return "UserItem{" +
                "amount=" + amount +
                ", item='" + item + '\'' +
                '}';
    }
}
