import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {
 if (update.hasMessage()){
   Message  message=update.getMessage();
   long chat_id=message.getChatId();
     if (message.hasText()){
         String text=message.getText();
         System.out.println(text+update.getMessage().getChatId());
         try {
             execute(new SendMessage().setChatId(chat_id).setText(" "));
         } catch (TelegramApiException e) {
             e.printStackTrace();
         }
     }
 }
    }


    public String getBotUsername() { return"@BotForIlxomBot";
    }
    public String getBotToken() {
        return "1337621086:AAFhcE05U98GX7B-81JUXBaGkcOXg5Jvbuw";
    }
}
