package pro.sky.telegram_bot_shelter_for_pets.command;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import pro.sky.telegram_bot_shelter_for_pets.utils.MessageUtils;


/**
 * Данный класс формрует сообщения исодя из выбора volunteer
 */
@Component
public class Volunteer implements Command{

    private final MessageUtils messageUtils;

    public Volunteer(MessageUtils messageUtils) {
        this.messageUtils = messageUtils;
    }

    @Override
    public SendMessage execute(Update update) {
        return messageUtils.sendMessageCallOwner();
    }
}