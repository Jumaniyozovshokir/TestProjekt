import Buttons.KeyboardButton;
import Buttons.inlineButton;
import Model.User;
import emoji.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class pedbot extends TelegramLongPollingBot implements Emoji , BoshMenyu, Oqituvchi, Oquvchi , emoji.Darsliklar {
//    static String url="jdbc:postgresql://localhost:5432/MaktabBoti";
//    static   String userss="postgres";
//    static   String password="123";
    static int like=0;
    static int desLike=0;
    static  int count=0;
    Message message=new Message();

SendMessage sendMessage=new SendMessage();
    public String getBotUsername() { return "@PedagogSherobodBot"; }
    public String getBotToken() { return "1377728383:AAH0iIOYXM9S-rj3z2rwjlGqEwX790h9nKQ"; }
    public void onUpdateReceived(Update update) {
if (update.hasMessage()){
    message=update.getMessage();
    if (message.hasText()){
        String text=message.getText();
       String   userName=message.getChat().getUserName();
       String  lastName  =message.getChat().getLastName();
        String firstName=message.getChat().getFirstName();
        long chat_id=message.getChatId();
        String chat_id_B=String.valueOf(chat_id);
        String Taklif=text.substring(0,1);
        if (text.equals("/start")){
            KeyboardButton.BoshMeyu();
         String   text1="Assolomu alaykum: "+firstName+ "  "+lastName;
            count++;


                SendMessage sendMessage=new SendMessage();
                MyBot bot=new MyBot();
                try {
                    sendMessage.setChatId((long) 210519095).setText("Botga Yangi Foydalanuvchi Keldi \n\n "+"Familyasi: "+ lastName+":  "+"Ismi: "
                            +firstName+":  "+"Foydalanuvchi Nomi: "+userName+" \n\n Chat ID: "+chat_id+"\n\n Foydalanuvchilar Soni: "+count);
                    bot.execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

 //       String user_insert="INSERT INTO person(user_name,first_name,last_name,chat_id) values(?,?,?,?) ";
//            try {
//                Connection connection= DriverManager.getConnection(url,userss,password);
//                PreparedStatement preparedStatement = connection.prepareStatement(user_insert);
//                preparedStatement.setString(1,userName);
//                preparedStatement.setString(2,lastName);
//                preparedStatement.setString(3,firstName);
//                preparedStatement.setString(4,chat_id_B);
//                preparedStatement.executeUpdate();
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
                executeMsg(sendMessage.setChatId(chat_id).setText(text1).setReplyMarkup(KeyboardButton.BoshMeyu()));
        }

        else if (text.equals(oqituvchilar)||text.equals(backOqituvhi)){
            executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Bo'limni Tanlang.").setReplyMarkup(KeyboardButton.Oqituvchilar()));
        }
        else if( (text.equals(FanOqituvchisi))||(text.equals(backOqituvhi))){
            executeMsg(sendMessage.setChatId(chat_id).setText(lastName+" "+firstName+"\n O'zingiz uchun kerakli Hujjatni tanlng!")
                    .setReplyMarkup(KeyboardButton.OqituvchiHujjatlari()));
        }
        else  if ((text.equals(MaktabRahbarlari))){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(KeyboardButton.MaktabRahbarlari()));
        }
        else if ((text.equals(MENYU) )|| (text.equals(back_menu))){
            executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Bo'limni Tanlang!").setReplyMarkup(KeyboardButton.PortalMenu()));
        }
        else if (text.equals(backBoshMenyu)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(KeyboardButton.BoshMeyu()));}
        else if (text.equals(ElektronDarsliklar)){
            executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Tugmani Tanlang").setReplyMarkup(KeyboardButton.menyuFanlar()));
        }
        else if (text.equals(AsosiyHujjatlari)){
            executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Tugmani Tanlang!").setReplyMarkup(inlineButton.AsosiyHujjatlar()));
        }
        else if (text.equals(sinf_1)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.darslikTurkumi()));
        }
        else if (text.equals(sinf_2)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.IdarslikTurkumi()));
        }
        else if (text.equals(sinf_3)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.UdarslikTurkumi()));
        }
        else if (text.equals(sinf_40)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.TdarslikTurkumi()));
        }
        else if (text.equals(sinf_5)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.BdarslikTurkumi()));
        }
        else if (text.equals(sinf_6)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.OdarslikTurkumi()));
        }
        else if (text.equals(sinf_7)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.YdarslikTurkumi()));
        }
        else if (text.equals(sinf_8)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.SdarslikTurkumi()));
        }
        else if (text.equals(sinf_9)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.TUdarslikTurkumi()));
        }
        else if (text.equals(sinf_10)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.ONdarslikTurkumi()));
        }
        else if (text.equals(sinf_11)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.OBdarslikTurkumi()));
        }
        else  if (text.equals(TalimResurslari)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.TalimResurslari()));
        }
        else  if (text.equals(  Videdarslar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.VideoDarslarlar()));
        }
        else  if (text.equals(  Videoroliklar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.VideoRoliklar()));
        }
        else  if (text.equals(  LabaratoriyaIshlari)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.LaborotiraIshlari()));
        }
        else  if (text.equals(  Testlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Testlar()));
        }
        else  if (text.equals(  Animatsiyalar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Animatsiyalar()));
        }
        else  if (text.equals(  DarsdaKerakliFotolar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.DarsdaKarakliFatolar()));
        }
        else  if (text.equals(  ElektronLugatlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.ElektronLugatlar()));
        }
        else  if (text.equals(  OrgatuvchiOyinlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.OrgatuvchiOyinlar()));
        }
        else  if (text.equals(  DarsIshlanmalari)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.DarsIshlanmalar()));
        }
        else  if (text.equals(  MetodikTavsiyalar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.MetodikTavsiyalar()));
        }
        else  if (text.equals(  Ertaklar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Ertaklar()));
        }
        else  if (text.equals(  Hikoyalar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Hikoyalar()));
        }
        else  if (text.equals(  BitiruvImtihonSavollari)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.BituruvImtihonSavollari()));
        }
        else  if (text.equals(  Refaratlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Referatlar()));
        }
        else  if (text.equals(  Topishmoqlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Topishmoqlar()));
        }
        else  if (text.equals(  Sherlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.Sherlar()));
        }
        else  if (text.equals(  Dasturlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.DasturlarProgram()));
        }
        else  if (text.equals(  BadiyAdabiyotlar)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.BadiyAdabyot()));
        }
        else if (text.equals( fikrBildirish)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.FikrBildirish(like,desLike)));
        }
        else  if (text.equals(WebSaytlar)){
    executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.WebSaytlar()));
        }
        else  if (text.equals(TalimdaInnavatsiya)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.TalimdaInavatsiya()));
        }
        else  if (text.equals(TalimdaXalqoroBaholash)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.TalimdaXalqAroBaholash()));
        }
        else if (text.equals(E_Kutubxona)){
            executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.E_Kutubxona()));
        }
        else if (text.equals(direktor)){
            SendMessage sendMessage =new SendMessage();
            executeMsg(sendMessage.setChatId(chat_id).setText("Direktor Bo'limida Hozircha Faqat Ish Rejalar Kiritilgan Yana Biron Ma'lumot Kerak Bo'lsa Habar" +
                    "Yuborish Bo'limida Bizga Habar Yuboring Biz Siz Kerakli Ma'lumotni Yuboramiz."));
            executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/343?single"));
            executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/344?single"));
            executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/345?single"));
            executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/346?single"));
        }
        else if ((text.equals(yoshlarIttifoqi))){
                SendMessage sendMessage =new SendMessage();
                executeMsg(sendMessage.setChatId(chat_id).setText("Yoshlar Yetakchisi Bo'limida Hozircha Faqat Ish Rejalar Kiritilgan Yana Biron Ma'lumot Kerak Bo'lsa Habar" +
                        "Yuborish Bo'limida Bizga Habar Yuboring Biz Siz Kerakli Ma'lumotni Yuboramiz."));
                executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/347?single"));
            }
        else if ((text.equals(psixolog))){
            SendMessage sendMessage =new SendMessage();
            executeMsg(sendMessage.setChatId(chat_id).setText("Psixologiya Bo'limida Hozircha Faqat Ish Rejalar Kiritilgan Yana Biron Ma'lumot Kerak Bo'lsa Habar" +
                    "Yuborish Bo'limida Bizga Habar Yuboring Biz Siz Kerakli Ma'lumotni Yuboramiz."));
            executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/347?single"));
        }
        else if (text.equals(Robototexnika)){
                executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/348?single").setReplyMarkup(inlineButton.Robototexnika()));
            }
        else  if (text.equals(testTopshirish)){
            executeMsg(sendMessage.setChatId(chat_id).setText("Test Bo'limiga O'ting! ").setReplyMarkup(inlineButton.TestTopshirish()));
        }
        else  if (text.equals(testTuzish)){
            executeMsg(sendMessage.setChatId(chat_id).setText("Test Tuzish Bo'limiga O'ting! ").setReplyMarkup(inlineButton.TestTuzish()));
        }
        else  if(Taklif.equals("+")){
            SendMessage sendMessage=new SendMessage();
            sendMessage.setChatId(chat_id).setText("Taklifingizdan Minnatdormiz!");
            executeMsg(sendMessage);
            MyBot bot=new MyBot();
            try {
                sendMessage.setChatId(chat_id).setText(firstName+" "+lastName+"\nTaklifingiz Qabul Qilindi.Taklifingizdan Minnatdormiz!"+Like);
                executeMsg(sendMessage);
                sendMessage.setChatId((long) 210519095).setText("Botga Taklif Bildirildi \n\n "+"Familyasi: "+ lastName+":  "+"Ismi: "
                        +firstName+":  "+"Foydalanuvchi Nomi: "+userName
                +"\n\nBildirgan Fikri: "+text);
                bot.execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else {

          SendMessage  sendMessage=new SendMessage().setChatId(chat_id).setText("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83D\uDCBB Siz yuborgan Habar qabul qilinmadi\n\nBu bolimda ma'lumot kiritilmagan\n\n" +
                  "Qanday ma'lumot kiritishimizni hohlaysiz\n\nIltimost  Fikr bildirish bo'limida\n\nO'z fikrlaringizni bildiring\n\nFikringizni ➕ belgisi bilan yozing!.");
            executeMsg(sendMessage);
        }
    }
}
else  if (update.hasCallbackQuery()){
    System.out.println("Habar  keldi   "+update.getCallbackQuery().getData());
    long chat_id= update.getCallbackQuery().getMessage().getChatId();
      String data=update.getCallbackQuery().getData();
    SendMessage sendMessage=new SendMessage();
    if (data.equals(OzbekTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
  else   if (data.equals(RusTili)){
        executeMsg(sendMessage.setChatId(update.getMessage().getChatId()).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
  else   if (data.equals(QoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
  else   if (data.equals(TojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
  else   if (data.equals(TurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
  else   if (data.equals(QirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
  else   if (data.equals(QozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //2-sinflar uchun
    else   if (data.equals(IOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomi()));
    }
    else   if (data.equals(IRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomiRusTili()));

    }
    else   if (data.equals(IQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomiQoraQTili()));
    }
    else   if (data.equals(ITojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomiTojikTili()));
    }
    else   if (data.equals(ITurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomiTurkmanTili()));
    }
    else   if (data.equals(IQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomiQirgizTili()));
    }
    else   if (data.equals(IQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.IdarslikNomiQozoqTili()));
    }
  //3-sinf uchun
    else   if (data.equals(UOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarslikNomi()));
    }
    else   if (data.equals(URusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarslikNomiRusTili()));

    }
    else   if (data.equals(UQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarslikNomiQoraQTili()));
    }
    else   if (data.equals(UTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarslikNomiTojikTili()));
    }
    else   if (data.equals(UTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarsTlikNomiTurkmanTili()));
    }
    else   if (data.equals(UQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarslikNomiQirgizTili()));
    }
    else   if (data.equals(UQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.UdarslikNomiQozoqTili()));
    }
    //4-sinf uchun
    else   if (data.equals(TOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomi()));
    }
    else   if (data.equals(TRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomiRusTili()));

    }
    else   if (data.equals(TQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomiQoraQTili()));
    }
    else   if (data.equals(TTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomiTojikTili()));
    }
    else   if (data.equals(TTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomiTurkmanTili()));
    }
    else   if (data.equals(TQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomiQirgizTili()));
    }
    else   if (data.equals(TQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.TdarslikNomiQozoqTili()));
    }
    //5-sinflar uchun
    else   if (data.equals(BOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(BRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(BQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(BTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(BTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(BQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(BQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //6-sinflar uchun
    else   if (data.equals(OOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(ORusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(OQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(OTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(OTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(OQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(OQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //7-sinflar uchun
    else   if (data.equals(YOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(YRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(YQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(YTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(YTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(YQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(YQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //8-sinflar uchun
    else   if (data.equals(SOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(SRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(SQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(STojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(STurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(SQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(SQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //9-sinflar uchun
    else   if (data.equals(TUOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(TURusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(TUQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(TUTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(TUTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(TUQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(TUQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //10-sinflar uchun
    else   if (data.equals(ONOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(ONRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(ONQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(ONTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(ONTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(ONQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(ONQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
    //11-sinflar uchun
    else   if (data.equals(OBOzbekTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomi()));
    }
    else   if (data.equals(OBRusTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiRusTili()));

    }
    else   if (data.equals(OBQoraQolpoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQoraQTili()));
    }
    else   if (data.equals(OBTojikTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTojikTili()));
    }
    else   if (data.equals(OBTurkmaTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiTurkmanTili()));
    }
    else   if (data.equals(OBQirgizTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQirgizTili()));
    }
    else   if (data.equals(OBQozoqTili)){
        executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli Kitobni Tanlang!").setReplyMarkup(inlineButton.darslikNomiQozoqTili()));
    }
//1-sinf
    else   if (data.equals(Alifbe)){


       executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_uzb.pdf"));
    }
    else   if (data.equals(AtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_uzb.pdf"));
    }
    else   if (data.equals(InglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_uzb.pdf"));
    }
    else   if (data.equals(FransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_uzb.pdf"));
    }
    else   if (data.equals(JismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_uzb.pdf"));
    }
    else   if (data.equals(Matematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_uzb.pdf"));
    }
    else   if (data.equals(MatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_uzb.pdf"));
    }
    else   if (data.equals(Musiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_uzb.pdf");

    }
    else   if (data.equals(NemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_uzb.pdf"));
    }
    else   if (data.equals(NutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_uzb.pdf"));
    }
    else   if (data.equals(OdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_uzb.pdf"));
    }
    else   if (data.equals(OnaTili )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ona_tili_1_uzb.pdf"));
    }
    else   if (data.equals(Oqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_uzb.pdf"));
    }
    else   if (data.equals(Tarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_uzb.pdf"));
    }
    else   if (data.equals(TasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_uzb.pdf"));
    }
    else   if (data.equals(Texnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_uzb.pdf"));
    }
    else   if (data.equals(YozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_uzb.pdf"));
    }
//Rus tili uchun
    else   if (data.equals(rAlifbe)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_rus.pdf"));
    }
    else   if (data.equals(rAtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_rus.pdf"));
    }
    else   if (data.equals(rInglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_rus.pdf"));
    }
    else   if (data.equals(rFransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_rus.pdf"));
    }
    else   if (data.equals(rJismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(rMatematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(rMatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_rus.pdf"));
    }
    else   if (data.equals(rMusiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_rus.pdf");

    }
    else   if (data.equals(rNemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_rus.pdf"));
    }
    else   if (data.equals(rNutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_rus.pdf"));
    }
    else   if (data.equals(rOdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_rus.pdf"));
    }

    else  if (data.equals(rOqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_rus.pdf"));
    }
    else  if (data.equals(rTarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_rus.pdf"));
    }
    else  if (data.equals(rTasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_rus.pdf"));
    }
    else  if (data.equals(rTexnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_rus.pdf"));
    }
    else  if (data.equals(rYozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_rus.pdf"));
    }
    else  if (data.equals(rRusTili )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/rus_tili_1_rus.pdf"));
    }
//Qora qolpoq tili
    else   if (data.equals(qAlifbe)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_qqr.pdf"));
    }
    else   if (data.equals(qAtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_qqr.pdf"));
    }
    else   if (data.equals(qInglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_qqr.pdf"));
    }
    else   if (data.equals(qFransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_qqr.pdf"));
    }
    else   if (data.equals(qJismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_qqr.pdf"));
    }
    else   if (data.equals(qMatematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_qqr.pdf"));
    }
    else   if (data.equals(qMatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_qqr.pdf"));
    }
    else   if (data.equals(qMusiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_qqr.pdf");

    }
    else   if (data.equals(qNemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_qqr.pdf"));
    }
    else   if (data.equals(qNutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_qqr.pdf"));
    }
    else   if (data.equals(qOdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_rus.pdf"));
    }

    else  if (data.equals(qOqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_qqr.pdf"));
    }
    else  if (data.equals(qTarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_qqr.pdf"));
    }
    else  if (data.equals(qTasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_qqr.pdf"));
    }
    else  if (data.equals(qTexnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_qqr.pdf"));
    }
    else  if (data.equals(qYozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_qqr.pdf"));
    }

    //Tojik Tili
    else   if (data.equals(toAlifbe)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_rus.pdf"));
    }
    else   if (data.equals(toAtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_rus.pdf"));
    }
    else   if (data.equals(toInglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_rus.pdf"));
    }
    else   if (data.equals(toFransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_rus.pdf"));
    }
    else   if (data.equals(toJismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(toMatematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(toMatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_rus.pdf"));
    }
    else   if (data.equals(toMusiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_rus.pdf");

    }
    else   if (data.equals(toNemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_rus.pdf"));
    }
    else   if (data.equals(toNutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_rus.pdf"));
    }
    else   if (data.equals(toOdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_rus.pdf"));
    }

    else  if (data.equals(toOqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_rus.pdf"));
    }
    else  if (data.equals(toTarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_rus.pdf"));
    }
    else  if (data.equals(toTasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_rus.pdf"));
    }
    else  if (data.equals(toTexnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_rus.pdf"));
    }
    else  if (data.equals(toYozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_rus.pdf"));
    }

    //Turkman Tili
    else   if (data.equals(tuAlifbe)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_rus.pdf"));
    }
    else   if (data.equals(tuAtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_rus.pdf"));
    }
    else   if (data.equals(tuInglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_rus.pdf"));
    }
    else   if (data.equals(tuFransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_rus.pdf"));
    }
    else   if (data.equals(tuJismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(tuMatematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(tuMatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_rus.pdf"));
    }
    else   if (data.equals(tuMusiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_rus.pdf");

    }
    else   if (data.equals(tuNemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_rus.pdf"));
    }
    else   if (data.equals(tuNutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_rus.pdf"));
    }
    else   if (data.equals(tuOdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_rus.pdf"));
    }

    else  if (data.equals(tuOqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_rus.pdf"));
    }
    else  if (data.equals(tuTarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_rus.pdf"));
    }
    else  if (data.equals(tuTasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_rus.pdf"));
    }
    else  if (data.equals(tuTexnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_rus.pdf"));
    }
    else  if (data.equals(tuYozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_rus.pdf"));
    }
    //Qirg'iz Tili
    else   if (data.equals(qiAlifbe)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_rus.pdf"));
    }
    else   if (data.equals(qiAtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_rus.pdf"));
    }
    else   if (data.equals(qiInglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_rus.pdf"));
    }
    else   if (data.equals(qiFransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_rus.pdf"));
    }
    else   if (data.equals(qijismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(qiMatematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(qiMatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_rus.pdf"));
    }
    else   if (data.equals(qiMusiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_rus.pdf");

    }
    else   if (data.equals(qiNemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_rus.pdf"));
    }
    else   if (data.equals(qiNutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_rus.pdf"));
    }
    else   if (data.equals(qiOdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_rus.pdf"));
    }
    else   if (data.equals(qiOqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_rus.pdf"));
    }
    else   if (data.equals(qiTarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_rus.pdf"));
    }
    else   if (data.equals(qiTasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_rus.pdf"));
    }
    else   if (data.equals(qiTexnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_rus.pdf"));
    }
    else   if (data.equals(qiYozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_rus.pdf"));
    }
    //Qozoq Tili
    else   if (data.equals(qoAlifbe)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/alifbe_1_rus.pdf"));
    }
    else   if (data.equals(qoAtrofimizdagiOlam)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/atrofimizdagi_olam_1_rus.pdf"));
    }
    else   if (data.equals(qoInglizTili)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/ingliz_tili_1_rus.pdf"));
    }
    else   if (data.equals(qoFransuzTili)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/fransuz_tili_1_rus.pdf"));
    }
    else   if (data.equals(qoJismoniyTarbiya)){

        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(qoMatematika)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_1_rus.pdf"));
    }
    else   if (data.equals(qoMatematikaDaftari)){

        executeMsg( sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/matematika_daftari_1_rus.pdf"));
    }
    else   if (data.equals(qoMusiqa)){
        sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/musiqa_1_rus.pdf");

    }
    else   if (data.equals(qoNemisTili)){

        executeMsg(  sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nemis_tili_1_rus.pdf"));
    }
    else   if (data.equals(qoNutuqOstirish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/nutq_ostirish_maxsus_1_rus.pdf"));
    }
    else   if (data.equals(qoOdobNoma )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/odobnoma_1_rus.pdf"));
    }
    else   if (data.equals(qoOqish )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/oqish_1_rus.pdf"));
    }
    else   if (data.equals(qoTarbiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tarbiya_1_rus.pdf"));
    }
    else   if (data.equals(qoTasviriySanat )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/tasviriy_sanat_1_rus.pdf"));
    }
    else   if (data.equals(qoTexnologiya )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/texnologiya_1_rus.pdf"));
    }
    else   if (data.equals(qoYozuvDaftari )){
        executeMsg(sendMessage.setChatId(chat_id).setText("http://eduportal.uz/Umumiyfiles/darsliklar/1/yozuv_daftari_1_rus.pdf"));
    }
//2-sinf
    // 3-sinf

    // 4-sinf

    // 5-sinf

    // 6-sinf

    // 7-sinf

    // 8-sinf

    // 9-sinf

    // 10-sinf

    // 11-sinf


}
      if (update.hasCallbackQuery()) {
          System.out.println("Habar  keldi   " + update.getCallbackQuery().getData());
          long chat_id = update.getCallbackQuery().getMessage().getChatId();
          String data = update.getCallbackQuery().getData();

          if (data.equals(Like)) {
              like++;
              executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.FikrBildirish(like, desLike)));
          }

          else if(data.equals(ChorakTestlar)){
              SendMessage sendMessage=new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("Xozircha Informatika Fanidan Testlar Yuklangan Tez Orada " +
                      "Boshqa Fanlardan Ham Yuklaymiz.").setReplyMarkup(inlineButton.FanlarTestUchun()));
          }
          else if (data.equals(Informatika)){
              SendMessage sendMessage=new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/349?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/350?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/351?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/352?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/353?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/354?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/355?single"));
          }
          else if (data.equals(Deslike))
          {
              desLike++;
              executeMsg(sendMessage.setChatId(chat_id).setReplyMarkup(inlineButton.FikrBildirish(like, desLike)));
          }

          else if (data.equals(Taklif))
          {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("➕ Qo'yib So'ng Takliflaringizni Yozib Yuboring!"));
          } else if (data.equals(DTS))
          {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/76?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/77?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/78?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/79?single"));
          } else if (data.equals(OquvDasturi))
          {
              executeMsg(sendMessage.setChatId(chat_id).setText("Kerakli sinfni tanlang").setReplyMarkup(inlineButton.OquvDasturlari()));
          }
          else if (data.equals(dsinf_1))

          {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/81?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/82?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/83?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/84?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/85?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/86?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/87?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/88?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/89?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/90?single"));
          }
          else if (data.equals(dsinf_2))
          {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/91?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/92?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/93?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/94?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/95?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/96?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/97?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/98?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/99?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/101?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/102?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/103?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/104?single"));

          }
          else if (data.equals(dsinf_2)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/105?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/106?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/107?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/108?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/109?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/110?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/111?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/112?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/113?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/114?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/115?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/116?single"));

          }
          else if (data.equals(dsinf_2)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/117?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/118?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/119?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/120?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/121?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/122?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/123?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/124?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/125?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/126?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/127?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/128?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/129?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/130?single"));
          }
          else if (data.equals(dsinf_5)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/131?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/132?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/133?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/134?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/135?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/136?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/137?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/138?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/139?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/140?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/141?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/142?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/143?single"));
          }
          else if (data.equals(dsinf_6)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/144?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/145?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/146?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/147?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/148?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/149?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/150?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/151?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/152?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/153?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/154?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/155?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/156?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/157?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/158?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/159?single"));
          }
          else if (data.equals(dsinf_7)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/160?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/161?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/162?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/163?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/164?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/165?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/166?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/167?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/168?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/169?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/170?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/171?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/172?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/173?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/174?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/175?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/176?single"));
          }
          else if (data.equals(dsinf_8)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/177?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/178?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/179?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/180?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/181?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/182?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/183?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/184?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/185?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/186?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/187?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/188?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/189?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/190?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/191?single"));
          }
          else if (data.equals(dsinf_9)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/192?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/193?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/194?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/195?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/196?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/197?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/198?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/199?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/200?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/201?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/202?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/203?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/204?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/205?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/206?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/207?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/208?single"));
          }
          else if (data.equals(dsinf_10)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/209?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/210?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/211?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/212?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/213?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/214?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/215?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/216?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/217?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/218?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/219?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/220?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/221?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/222?single"));

          }
          else if (data.equals(dsinf_11)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/223?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/224?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/225?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/226?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/227?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/228?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/229?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/230?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/231?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/232?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/233?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/234?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/235?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/236?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/237?single"));
          }
          else if (data.equals(PIRLS)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/240?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/241?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/242?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/243?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/244?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/245"));

          }
          else if (data.equals(PISA)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/246?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/247?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/248?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/249?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/250?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/251?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/252?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/253?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/254?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/255?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/256?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/257?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/258?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/259?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/260?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/261?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/262?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/263?single"));}
           else if (data.equals(TALIMSIFATI)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/265?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/266?single"));
      }
           else if (data.equals(TIMSS)) {SendMessage sendMessage = new SendMessage();
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/267?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/268?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/269?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/270?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/271?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/272?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/273?single"));
          executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/274?single"));
      }
          else if (data.equals(TALIS)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/275?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/276?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/277?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/278?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/279?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/280?single"));
          }
          else if (data.equals(QrCode)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/283?single"));}
          else if (data.equals(Talim2030)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/286?single"));}
          else if (data.equals(KasblarKompasi)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/282?single"));}
          else if (data.equals(Steam)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/284?single"));}
          else if (data.equals(TalimdaSteamYondashuv)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/285?single"));}
          else if (data.equals(CLIL)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/281?single"));}
          else if (data.equals(TanqidiyFikrlash)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/287?single"));}
          else if (data.equals(TashxisMarkazi)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/288?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/289?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/290?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/291?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/292?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/293?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/294?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/295?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/296?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/297?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/298?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/299?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/300?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/301?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/302?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/303?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/304?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/305?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/306?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/307?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/308?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/309?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/310?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/311?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/312?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/313?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/314?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/315?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/316?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/317?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/318?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/319?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/320?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/321?single"));

          }
          else if (data.equals(TalimdaAKT)) {
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/324?single"));}
          else if (data.equals(AvloniyNomidagiXTRMXQTMOI)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/325?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/326?single"));}
          else if (data.equals(Pedagogika)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/327?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/328?single"));}
          else if (data.equals(Didaktika)) {SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/329??single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/330?single"));
          }
          else if (data.equals(Kitoblar)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/331?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/332?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/333?single"));

              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/335?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/336?single"));}
          else if (data.equals(SinfRahbarlik)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/338?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/341?single"));}
          else if (data.equals(TaqvimMavzuRejasi)) {
              SendMessage sendMessage = new SendMessage();
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/340?single"));
              executeMsg(sendMessage.setChatId(chat_id).setText("https://t.me/metod10m/339?single"));}


      } }
    private void executeMsg(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
