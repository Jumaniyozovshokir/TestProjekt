import Model.User;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {


        ApiContextInitializer.init();
            TelegramBotsApi botsApi=new TelegramBotsApi();
            try {
                botsApi.registerBot(new pedbot());
            } catch (TelegramApiRequestException e) {
                e.printStackTrace();
            }
        }}

