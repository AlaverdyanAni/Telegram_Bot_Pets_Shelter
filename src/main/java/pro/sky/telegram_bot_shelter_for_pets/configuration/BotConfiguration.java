package pro.sky.telegram_bot_shelter_for_pets.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class BotConfiguration {

    @Value("${telegram.bot.name}")
    private String name;

    @Value("${TELEGRAM_BOT_TOKEN}")
    private String token;
}
