package Buttons;

import emoji.BoshMenyu;
import emoji.Emoji;
import emoji.Oqituvchi;
import emoji.Oquvchi;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import java.util.ArrayList;
import java.util.List;
public class KeyboardButton implements Emoji, BoshMenyu, Oqituvchi, Oquvchi {
    public  static ReplyKeyboardMarkup BoshMeyu(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(false);
        List<KeyboardRow> keyboardRows=new ArrayList<KeyboardRow>();
        KeyboardRow keyboardButtons=new KeyboardRow();
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(oqituvchilar));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(oquvchi));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(MENYU));
        KeyboardRow keyboardButtons1=new KeyboardRow();
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(fikrBildirish));
        keyboardRows.add(keyboardButtons);
        keyboardRows.add(keyboardButtons1);
        return replyKeyboardMarkup.setKeyboard(keyboardRows);
    }
    public  static ReplyKeyboardMarkup menyuFanlar(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(false);
        List<KeyboardRow>keyboardRows=new ArrayList<KeyboardRow>();
        KeyboardRow keyboardButtons=new KeyboardRow();
        KeyboardRow keyboardButtons1=new KeyboardRow();
        KeyboardRow keyboardButtons2=new KeyboardRow();
        KeyboardRow keyboardButtons3=new KeyboardRow();
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_1));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_2));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_3));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_40));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_5));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_6));
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_7));
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_8));
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_9));
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_10));
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(sinf_11));
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(back_menu));
        keyboardRows.add(keyboardButtons);
        keyboardRows.add(keyboardButtons1);
        keyboardRows.add(keyboardButtons2);
        keyboardRows.add(keyboardButtons3);
        return replyKeyboardMarkup.setKeyboard(keyboardRows);
    }
    public  static ReplyKeyboardMarkup PortalMenu(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(false);

        List<KeyboardRow>keyboardRows=new ArrayList<KeyboardRow>();

        KeyboardRow keyboardButtons=new KeyboardRow();
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(ElektronDarsliklar));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(TalimResurslari));

        KeyboardRow keyboardButtons1=new KeyboardRow();
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Videdarslar));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Videoroliklar));

        KeyboardRow keyboardButtons2=new KeyboardRow();
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(LabaratoriyaIshlari));
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Testlar));

        KeyboardRow keyboardButtons3=new KeyboardRow();
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Animatsiyalar));
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(DarsdaKerakliFotolar));

        KeyboardRow keyboardButtons4=new KeyboardRow();
        keyboardButtons4.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(ElektronLugatlar));
        keyboardButtons4.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(OrgatuvchiOyinlar));

        KeyboardRow keyboardButtons5=new KeyboardRow();
        keyboardButtons5.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(DarsIshlanmalari));
        keyboardButtons5.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(MetodikTavsiyalar));

        KeyboardRow keyboardButtons6=new KeyboardRow();
        keyboardButtons6.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Ertaklar));
        keyboardButtons6.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Hikoyalar));

        KeyboardRow keyboardButtons7=new KeyboardRow();
        keyboardButtons7.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(BitiruvImtihonSavollari));
        keyboardButtons7.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Refaratlar));

        KeyboardRow keyboardButtons8=new KeyboardRow();
        keyboardButtons8.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Topishmoqlar));
        keyboardButtons8.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Sherlar));

        KeyboardRow keyboardButtons9=new KeyboardRow();
        keyboardButtons9.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Dasturlar));
        keyboardButtons9.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(BadiyAdabiyotlar));

        KeyboardRow keyboardButtons10=new KeyboardRow();
        keyboardButtons10.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(backBoshMenyu));

        keyboardRows.add(keyboardButtons);
        keyboardRows.add(keyboardButtons1);
        keyboardRows.add(keyboardButtons2);
        keyboardRows.add(keyboardButtons3);
        keyboardRows.add(keyboardButtons4);
        keyboardRows.add(keyboardButtons5);
        keyboardRows.add(keyboardButtons6);
        keyboardRows.add(keyboardButtons7);
        keyboardRows.add(keyboardButtons8);
        keyboardRows.add(keyboardButtons9);
        keyboardRows.add(keyboardButtons10);

        return replyKeyboardMarkup.setKeyboard(keyboardRows);
    }
    public  static ReplyKeyboardMarkup MaktabRahbarlari(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(false);

        List<KeyboardRow>keyboardRows=new ArrayList<KeyboardRow>();

        KeyboardRow keyboardButtons=new KeyboardRow();
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(direktor));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(yoshlarIttifoqi));

        KeyboardRow keyboardButtons1=new KeyboardRow();
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(oquvIshlari));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(manaviyIshlar));

        KeyboardRow keyboardButtons2=new KeyboardRow();
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(psixolog));
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(yocht));

        KeyboardRow keyboardButtons3=new KeyboardRow();
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Texnozor));
        keyboardButtons3.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(WebSaytlar));

        KeyboardRow keyboardButtons4=new KeyboardRow();
        keyboardButtons4.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(backOqituvhi));

        keyboardRows.add(keyboardButtons);
        keyboardRows.add(keyboardButtons1);
        keyboardRows.add(keyboardButtons2);
        keyboardRows.add(keyboardButtons3);
        keyboardRows.add(keyboardButtons4);


        return replyKeyboardMarkup.setKeyboard(keyboardRows);
    }
    public  static ReplyKeyboardMarkup Oqituvchilar(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(false);
        List<KeyboardRow> keyboardRows=new ArrayList<KeyboardRow>();
        KeyboardRow keyboardButtons=new KeyboardRow();
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(FanOqituvchisi));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(MaktabRahbarlari));

        KeyboardRow keyboardButtons1=new KeyboardRow();
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(WebSaytlar));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(backBoshMenyu));
        keyboardRows.add(keyboardButtons);
        keyboardRows.add(keyboardButtons1);
        return replyKeyboardMarkup.setKeyboard(keyboardRows);
    }
    public  static ReplyKeyboardMarkup OqituvchiHujjatlari(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(false);
        List<KeyboardRow> keyboardRows=new ArrayList<KeyboardRow>();
        KeyboardRow keyboardButtons=new KeyboardRow();
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(AsosiyHujjatlari));
        keyboardButtons.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(TalimdaInnavatsiya));

        KeyboardRow keyboardButtons1=new KeyboardRow();
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(TalimdaXalqoroBaholash));
        keyboardButtons1.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(E_Kutubxona));

        KeyboardRow keyboardButtons2=new KeyboardRow();
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(Robototexnika));
        keyboardButtons2.add(new org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton(backOqituvhi));

        keyboardRows.add(keyboardButtons);
        keyboardRows.add(keyboardButtons1);
        keyboardRows.add(keyboardButtons2);
        return replyKeyboardMarkup.setKeyboard(keyboardRows);
    }
}
