package github.io.koala3353.bot;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import github.io.koala3353.Config;
import github.io.koala3353.bot.commands.AboutCommand;
import github.io.koala3353.bot.commands.TradeCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bot {
    private static final Logger LOGGER = LoggerFactory.getLogger(Bot.class);

    public Bot() throws InterruptedException {
        // Initialize the waiter and client
        CommandClientBuilder client = new CommandClientBuilder();
        // Set the client settings
        client.setOwnerId(Config.get("owner_id"));
        client.setStatus(OnlineStatus.ONLINE);
        client.setActivity(Activity.listening("for loopholes"));
        addCommands(client);
        EventWaiter eventWaiter = new EventWaiter();
        // Finalize the command client
        CommandClient commandClient = client.build();

        JDABuilder.createDefault(Config.get("token"),
                    GatewayIntent.GUILD_MEMBERS,
                    GatewayIntent.GUILD_MESSAGES,
                    GatewayIntent.GUILD_MESSAGE_REACTIONS,
                    GatewayIntent.DIRECT_MESSAGES,
                    GatewayIntent.MESSAGE_CONTENT,
                    GatewayIntent.GUILD_PRESENCES,
                    GatewayIntent.GUILD_EMOJIS_AND_STICKERS,
                    GatewayIntent.SCHEDULED_EVENTS,
                    GatewayIntent.GUILD_VOICE_STATES)
            .addEventListeners(eventWaiter, commandClient)
            .setChunkingFilter(ChunkingFilter.ALL) // enable member chunking for all guilds
            .setMemberCachePolicy(MemberCachePolicy.ALL)
            .build().awaitReady();
    }
    private static void addCommands(CommandClientBuilder clientBuilder) {
        // Initialize the commands of the bot
        clientBuilder.addSlashCommands(new TradeCommand(), new AboutCommand());
        LOGGER.info("Added the slash commands");
        clientBuilder.addContextMenus();
        LOGGER.info("Added the context menus");
    }
}
