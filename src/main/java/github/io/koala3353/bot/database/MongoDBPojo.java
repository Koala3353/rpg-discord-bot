package github.io.koala3353.bot.database;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class MongoDBPojo {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MongoDBPojo.class);
    public static User getUser(long discordId) {
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb+srv://keenebrigado:s2jwxTBHPbFxxtNO@rpg-loophole.oc40e.mongodb.net/?retryWrites=true&w=majority&appName=rpg-loophole";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("rpg").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<User> collection = database.getCollection("user", User.class);
            User user = collection.find(eq("discord", discordId)).first();
            LOGGER.info("Retrieved user from MongoDB successfully " + user.toString());
            return user;
        }
    }

    public static User addUser(long discordId) {
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb+srv://keenebrigado:s2jwxTBHPbFxxtNO@rpg-loophole.oc40e.mongodb.net/?retryWrites=true&w=majority&appName=rpg-loophole";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("rpg").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<User> collection = database.getCollection("user", User.class);
            User user = new User(discordId);
            collection.insertOne(user);
            LOGGER.info("Added user to MongoDB successfully " + user.toString());
            return user;
        }
    }

    // Items

    public static Item getItem(String itemId) {
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb+srv://keenebrigado:s2jwxTBHPbFxxtNO@rpg-loophole.oc40e.mongodb.net/?retryWrites=true&w=majority&appName=rpg-loophole";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("rpg").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Item> collection = database.getCollection("items", Item.class);
            Item item = collection.find(eq("id", itemId)).first();
            LOGGER.info("Retrieved item from MongoDB successfully " + item.toString());
            return item;
        }
    }

    public static List<Item> getItems() {
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb+srv://keenebrigado:s2jwxTBHPbFxxtNO@rpg-loophole.oc40e.mongodb.net/?retryWrites=true&w=majority&appName=rpg-loophole";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("rpg").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Item> collection = database.getCollection("items", Item.class);
            List<Item> items = new ArrayList<>();
            collection.find().into(items);
            LOGGER.info("Retrieved items from MongoDB successfully " + items);
            return items;
        }
    }

    public static void main(String[] args) {
        // Test the MongoDB connection
        getUser(959233424890142801L);
        //addUser(959233424890142801);
        getItems();
    }
}