package Buttons;

import emoji.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
public class inlineButton implements Emoji, BoshMenyu, Oqituvchi, Oquvchi, emoji.Darsliklar {
   //1-sinf
    static public InlineKeyboardMarkup darslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup darslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
   //2-sinf
   static public InlineKeyboardMarkup IdarslikTurkumi() {
       InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
       List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

       List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(IOzbekTili));
       inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(IRusTili));
       inlineRows.add(inlineRow);

       inlineRow = new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(IQoraQolpoqTili));
       inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(ITojikTili));
       inlineRows.add(inlineRow);

       inlineRow=new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(ITurkmaTili));
       inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(IQirgizTili));
       inlineRows.add(inlineRow);

       inlineRow=new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(IQozoqTili));
       inlineRows.add(inlineRow);
       inlineRow = new ArrayList<InlineKeyboardButton>();

       inlineRows.add(inlineRow);
       inlineKeyboardMarkup.setKeyboard(inlineRows);
       return inlineKeyboardMarkup;
   }
    static public InlineKeyboardMarkup IdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(IAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(IAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(IInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(IFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(IJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(IMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(IMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(IMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(INemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(INutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(IOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(IOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(IOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(ITarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(ITasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(ITexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(IYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup IdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(IrAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(IrAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(IrInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(IrFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(IrJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(IrMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(IrMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(IrMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(IrNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(IrNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(IrOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(IrOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(IrOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(IrTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(IrTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(IrTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(IrYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(IrRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup IdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(IqAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(IqAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(IqInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(IqFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(IqJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(IqMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(IqMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(IqMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(IqNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(IqNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(IqOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(IqOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(IqOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(IqTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(IqTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(IqTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(IqYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup IdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(ItoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(ItoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(ItoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(ItoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(ItoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(ItoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(ItoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(ItoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(ItoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(ItoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(ItoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(ItoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(ItoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(ItoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(ItoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(IrTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(ItoYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup IdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(ItuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(ItuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(ItuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(ItuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(ItuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(ItuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(ItuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(ItuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(ItuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(ItuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(ItuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(ItuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(ItuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(ItuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(ItuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(ItuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(ItuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup IdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(IqiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(IqiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(IqiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(IqiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(IqijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(IqiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(IqiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(IqiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(IqiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(IqiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(IqiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(IqiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(IqiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(IqiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(IqiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(IqiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup IdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(IqoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(IqoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(IqoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(IqoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(IqoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(IqoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(IqoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(IqoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(IqoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(IqoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(IqoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(IqoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(IqoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(IqoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(IqoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(IqoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(IqoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //3-sinf
    static public InlineKeyboardMarkup UdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(UOzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(URusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(UQoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(UTojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(UTurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(UQirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(UQozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UrAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UrAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UrInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UrFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UrJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UrMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UrMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UrMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UrNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UrNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UrOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UrOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UrOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UrTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UrTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UrTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UrYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(UrRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UqAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UqAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UqInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UqFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UqJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UqMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UqMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UqMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UqNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UqNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UqOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UqOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UqOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UqTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UqTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UqTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UqYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UtoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UtoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UtoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UtoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UtoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UtoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UtoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UtoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UtoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UtoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UtoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UtoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UtoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UtoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UtoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UtoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UtoYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarsTlikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UtuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UtuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UtuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UtuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UtuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UtuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UtuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UtuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UtuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UtuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UtuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UtuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UtuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UtuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UtuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UtuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UtuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UqiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UqiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UqiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UqiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UqijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UqiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UqiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UqiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UqiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UqiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UqiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UqiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UqiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UqiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UqiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UqiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UqiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup UdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(UqoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(UqoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(UqoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(UqoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(UqoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(UqoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(UqoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(UqoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(UqoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(UqoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(UqoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(UqoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(UqoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(UqoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(UqoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(UqoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(UqoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
   // 4-sinf
   static public InlineKeyboardMarkup TdarslikTurkumi() {
       InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
       List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

       List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(TOzbekTili));
       inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(TRusTili));
       inlineRows.add(inlineRow);

       inlineRow = new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(TQoraQolpoqTili));
       inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TTojikTili));
       inlineRows.add(inlineRow);

       inlineRow=new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TTurkmaTili));
       inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(TQirgizTili));
       inlineRows.add(inlineRow);

       inlineRow=new ArrayList<InlineKeyboardButton>();
       inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(TQozoqTili));
       inlineRows.add(inlineRow);
       inlineRow = new ArrayList<InlineKeyboardButton>();

       inlineRows.add(inlineRow);
       inlineKeyboardMarkup.setKeyboard(inlineRows);
       return inlineKeyboardMarkup;
   }
    static public InlineKeyboardMarkup TdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(TNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TrAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TrAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TrInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TrFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TrJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TrMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TrMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TrMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TrNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(TrNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TrOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TrOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TrOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(TrTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TrTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TrTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TrYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(TrRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TqAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TqAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TqInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TqFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TqJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TqMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TqMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TqMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TqNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(TqNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TqOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TqOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TqOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(TqTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TqTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TqTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TqYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TtoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TtoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TtoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TtoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TtoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TtoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TtoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TtoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TtoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(TtoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TtoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TtoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TtoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(TtoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TtoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TrTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TtoYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TtuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TtuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TtuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TtuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TtuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TtuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TtuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TtuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TtuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TtuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TtuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TtuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(TtuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TtuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TtuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TtuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TqiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TqiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TqiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TqiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TqijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TqiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TqiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TqiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TqiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(TqiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TqiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TqiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TqiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(TqiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TqiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TqiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TqiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(TqoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(TqoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(TqoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(TqoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(TqoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(TqoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(TqoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(TqoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(TqoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(TqoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(TqoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(TqoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(TqoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(TqoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TqoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(TqoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(TqoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
//5-sinf
    static public InlineKeyboardMarkup BdarslikTurkumi() {
    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
    List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

    List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
    inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
    inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
    inlineRows.add(inlineRow);

    inlineRow = new ArrayList<InlineKeyboardButton>();
    inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
    inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
    inlineRows.add(inlineRow);

    inlineRow=new ArrayList<InlineKeyboardButton>();
    inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
    inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
    inlineRows.add(inlineRow);

    inlineRow=new ArrayList<InlineKeyboardButton>();
    inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
    inlineRows.add(inlineRow);
    inlineRow = new ArrayList<InlineKeyboardButton>();

    inlineRows.add(inlineRow);
    inlineKeyboardMarkup.setKeyboard(inlineRows);
    return inlineKeyboardMarkup;
}
    static public InlineKeyboardMarkup BdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //6-sinf
    static public InlineKeyboardMarkup OdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //7-sinf
    static public InlineKeyboardMarkup YdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup YdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //8-sinf
    static public InlineKeyboardMarkup SdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup SdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //9-sinf
    static public InlineKeyboardMarkup TUdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TUdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //10-sinf
    static public InlineKeyboardMarkup ONdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ONdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    //11-sinf
    static public InlineKeyboardMarkup OBdarslikTurkumi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OzbekTili).setCallbackData(OzbekTili));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(RusTili));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoraQolpoqTili).setCallbackData(QoraQolpoqTili));
        inlineRow.add(new InlineKeyboardButton(TojikTili).setCallbackData(TojikTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TurkmaTili).setCallbackData(TurkmaTili));
        inlineRow.add(new InlineKeyboardButton(QirgizTili).setCallbackData(QirgizTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QozoqTili).setCallbackData(QozoqTili));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomi() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(Alifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(AtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(InglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(FransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(JismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(Matematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(MatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(Musiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(NemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(NutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(OdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(OnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(Oqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(Tarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(TasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(Texnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(YozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomiRusTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(rAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(rAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(rInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(rFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(rJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(rMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(rMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(rMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(rNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(rNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(rOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(rOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(rOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(rTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(rTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(rYozuvDaftari));
        inlineRow.add(new InlineKeyboardButton(RusTili).setCallbackData(rRusTili));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomiQoraQTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomiTojikTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(toAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(toAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(toInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(toFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(toJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(toMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(toMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(toMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(toNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(toNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(toOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(toOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(toOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(toTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(toTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(rTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(toYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomiTurkmanTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(tuAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(tuAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(tuInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(tuFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(tuJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(tuMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(tuMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(tuMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(tuNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(tuNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(tuOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(tuOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(tuOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(tuTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(tuTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(tuTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(tuYozuvDaftari));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomiQirgizTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qiAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qiAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qiInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qiFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qijismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qiMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qiMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qiMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qiNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qiNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qiOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qiOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qiOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qiTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qiTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qiTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qiYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OBdarslikNomiQozoqTili() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Alifbe).setCallbackData(qoAlifbe));
        inlineRow.add(new InlineKeyboardButton(AtrofimizdagiOlam).setCallbackData(qoAtrofimizdagiOlam));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InglizTili).setCallbackData(qoInglizTili));
        inlineRow.add(new InlineKeyboardButton(FransuzTili).setCallbackData(qoFransuzTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(JismoniyTarbiya).setCallbackData(qoJismoniyTarbiya));
        inlineRow.add(new InlineKeyboardButton(Matematika).setCallbackData(qoMatematika));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatematikaDaftari).setCallbackData(qoMatematikaDaftari));
        inlineRow.add(new InlineKeyboardButton(Musiqa ).setCallbackData(qoMusiqa));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(NemisTili).setCallbackData(qoNemisTili));
        inlineRow.add(new InlineKeyboardButton(NutuqOstirish).setCallbackData(qoNutuqOstirish));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OdobNoma).setCallbackData(qoOdobNoma));
        inlineRow.add(new InlineKeyboardButton(OnaTili).setCallbackData(qoOnaTili));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Oqish).setCallbackData(qoOqish));
        inlineRow.add(new InlineKeyboardButton(Tarbiya).setCallbackData(qoTarbiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TasviriySanat).setCallbackData(qoTasviriySanat));
        inlineRow.add(new InlineKeyboardButton(Texnologiya).setCallbackData(qoTexnologiya));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(YozuvDaftari).setCallbackData(qoYozuvDaftari));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }

    static public InlineKeyboardMarkup WebSaytlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();

        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(XtUzeduUz).setCallbackData(XtUzeduUz).setUrl("https://xt.uzedu.uz/Account/Login"));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(KundalikCom).setCallbackData(KundalikCom).setUrl("https://login.kundalik.com/login"));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(AttestatUzeduUz).setCallbackData(AttestatUzeduUz).setUrl("https://attestat.uzedu.uz/sign-in?ReturnUrl=%2Fschool%2Fclass%2F5166247"));
        inlineRows.add(inlineRow);

        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(AlimpiadaUz).setCallbackData(AlimpiadaUz).setUrl("https://oo.uzedu.uz/"));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MyMehnatUz).setCallbackData(MyMehnatUz).setUrl("https://my.mehnat.uz/login"));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(IshMehnatuz).setCallbackData(IshMehnatuz).setUrl("http://ish.mehnat.uz/"));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(SalaryMdmUz).setCallbackData(SalaryMdmUz).setUrl("http://salary.mdm.uz/account/login?ReturnUrl=%2F"));
        inlineRows.add(inlineRow);

        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(PropertyDavaktyUz).setCallbackData(PropertyDavaktyUz).setUrl("https://property.davaktiv.uz/login"));
        inlineRows.add(inlineRow);

        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TalimResurslari() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(PedagofVaAmalyotchilar).setCallbackData(PedagofVaAmalyotchilar).setUrl("https://eduportal.uz/Eduportal/Barchasi/1?submenu=69"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(ElektronAxTaRe).setCallbackData(ElektronAxTaRe).setUrl("https://eduportal.uz/Eduportal/Barchasi/1?submenu=70"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(KichikREsurslar).setCallbackData(KichikREsurslar).setUrl("https://eduportal.uz/Eduportal/Barchasi/1?submenu=75"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup VideoDarslarlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(FanlargaOidVideoDarslar).setCallbackData(FanlargaOidVideoDarslar).setUrl("https://eduportal.uz/Eduportal/Barchasi/17?submenu=5"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Maruzalar).setCallbackData(Maruzalar).setUrl("https://eduportal.uz/Eduportal/Barchasi/17?submenu=83"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup VideoRoliklar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(VideoRoliklar).setCallbackData(VideoRoliklar).setUrl("https://eduportal.uz/Eduportal/Barchasi/18"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup LaborotiraIshlari() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(VirtualLabarotoriya).setCallbackData(VirtualLabarotoriya).setUrl("https://eduportal.uz/Eduportal/Barchasi/13?submenu=10"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Videolaboratoriyalar).setCallbackData(Videolaboratoriyalar).setUrl("https://eduportal.uz/Eduportal/Barchasi/13?submenu=11"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Testlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Testlari).setCallbackData(Testlari).setUrl("https://eduportal.uz/Eduportal/Barchasi/19"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Animatsiyalar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Animatsiyalar).setCallbackData(Animatsiyalar).setUrl("https://eduportal.uz/Eduportal/Barchasi/20"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup DarsdaKarakliFatolar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Qushlar).setCallbackData(Qushlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/21?submenu=76"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Hayvonlar).setCallbackData(Hayvonlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/21?submenu=77"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Osimliklar).setCallbackData(Osimliklar).setUrl("https://eduportal.uz/Eduportal/Barchasi/21?submenu=78"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Hashoratlar).setCallbackData(Hashoratlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/21?submenu=79"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Boshqalar).setCallbackData(Boshqalar).setUrl("https://eduportal.uz/Eduportal/Barchasi/21?submenu=80"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup ElektronLugatlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(ElektronLugatlar).setCallbackData(ElektronLugatlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/22"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup OrgatuvchiOyinlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OrgatuvchiOyinlar).setCallbackData(OrgatuvchiOyinlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/23"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup DarsIshlanmalar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(PrezentatsiyaShaklidaDarsIshlanmalari).setCallbackData(PrezentatsiyaShaklidaDarsIshlanmalari).setUrl("https://eduportal.uz/Eduportal/Barchasi/24?submenu=28"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TekstShaklidaDarsIshlanmalari).setCallbackData(TekstShaklidaDarsIshlanmalari).setUrl("https://eduportal.uz/Eduportal/Barchasi/24?submenu=29"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(EngYaxshiDarsIshlanmasi).setCallbackData(EngYaxshiDarsIshlanmasi).setUrl("https://eduportal.uz/Eduportal/Barchasi/24?submenu=68"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup MetodikTavsiyalar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Matnli).setCallbackData(Matnli).setUrl("https://eduportal.uz/Eduportal/Barchasi/25?submenu=6"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Video).setCallbackData(Video).setUrl("https://eduportal.uz/Eduportal/Barchasi/25?submenu=73"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Interaktiv).setCallbackData(Interaktiv).setUrl("https://eduportal.uz/Eduportal/Barchasi/25?submenu=74"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(AvgustKengashMateriallari).setCallbackData(AvgustKengashMateriallari).setUrl("https://eduportal.uz/Eduportal/Barchasi/25?submenu=81"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OquvRejaVaDasturlar).setCallbackData(OquvRejaVaDasturlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/25?submenu=82"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Ertaklar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Ertaklar).setCallbackData(Ertaklar).setUrl("https://eduportal.uz/Eduportal/Barchasi/26"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Hikoyalar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Hikoyalar).setCallbackData(Hikoyalar).setUrl("https://eduportal.uz/Eduportal/Barchasi/27"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BituruvImtihonSavollari() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(BitiruvImtihonSavollari).setCallbackData(BitiruvImtihonSavollari).setUrl("https://eduportal.uz/Eduportal/Barchasi/28"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Referatlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Refaratlar).setCallbackData(Refaratlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/29"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Topishmoqlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(AudiyoTopishmoqlar).setCallbackData(AudiyoTopishmoqlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/31?submenu=42"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MatnShaklidaTopishmoqlar).setCallbackData(MatnShaklidaTopishmoqlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/31?submenu=43"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Sherlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Sherlar).setCallbackData(Sherlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/32"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup DasturlarProgram() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(AntiviruslarDaturlar).setCallbackData(AntiviruslarDaturlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/34?submenu=49"));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Drayverlar).setCallbackData(Drayverlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/34?submenu=50"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OfisDasturlar).setCallbackData(OfisDasturlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/34?submenu=51"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QoshimchaDasturlar).setCallbackData(QoshimchaDasturlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/34?submenu=52"));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(InternetDasturlari).setCallbackData(InternetDasturlari).setUrl("https://eduportal.uz/Eduportal/Barchasi/34?submenu=53"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup BadiyAdabyot() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(BadiyAdabiyotlar).setCallbackData(BadiyAdabiyotlar).setUrl("https://eduportal.uz/Eduportal/Barchasi/32"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup FikrBildirish(int count,int count2) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();

        inlineRow.add(new InlineKeyboardButton(Like+" "+count).setCallbackData(Like));
        inlineRow.add(new InlineKeyboardButton(Deslike+" "+count2).setCallbackData(Deslike));
        inlineRow.add(new InlineKeyboardButton(Taklif).setCallbackData(Taklif));

        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }


    static public InlineKeyboardMarkup AsosiyHujjatlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TaqvimMavzuRejasi).setCallbackData(TaqvimMavzuRejasi));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(SinfRahbarlik).setCallbackData(SinfRahbarlik));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(ChorakTestlar).setCallbackData(ChorakTestlar));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(MonitoringTestlar).setCallbackData(MonitoringTestlar));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(OquvDasturi).setCallbackData(OquvDasturi));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(DTS).setCallbackData(DTS));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TalimdaXalqAroBaholash() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(PIRLS).setCallbackData(PIRLS));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(PISA).setCallbackData(PISA));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TIMSS).setCallbackData(TIMSS));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TALIS).setCallbackData(TALIS));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TALIMSIFATI).setCallbackData(TALIMSIFATI));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TalimdaInavatsiya() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(QrCode).setCallbackData(QrCode));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Talim2030).setCallbackData(Talim2030));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(KasblarKompasi).setCallbackData(KasblarKompasi));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Steam).setCallbackData(Steam));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TalimdaSteamYondashuv).setCallbackData(TalimdaSteamYondashuv));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(CLIL).setCallbackData(CLIL));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TanqidiyFikrlash).setCallbackData(TanqidiyFikrlash));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup E_Kutubxona() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TashxisMarkazi).setCallbackData(TashxisMarkazi));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(TalimdaAKT).setCallbackData(TalimdaAKT));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(AvloniyNomidagiXTRMXQTMOI).setCallbackData(AvloniyNomidagiXTRMXQTMOI));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Pedagogika).setCallbackData(Pedagogika));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Didaktika).setCallbackData(Didaktika));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup Robototexnika() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Kitoblar).setCallbackData(Kitoblar));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }

    static public InlineKeyboardMarkup FanlarTestUchun() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(Informatika).setCallbackData(Informatika));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }

    static public InlineKeyboardMarkup OquvDasturlari() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_1).setCallbackData(dsinf_1));
        inlineRows.add(inlineRow);
        inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_2).setCallbackData(dsinf_2));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_3).setCallbackData(dsinf_3));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_40).setCallbackData(dsinf_40));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_5).setCallbackData(dsinf_5));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_6).setCallbackData(dsinf_6));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_7).setCallbackData(dsinf_7));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_8).setCallbackData(dsinf_8));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_9).setCallbackData(dsinf_9));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_10).setCallbackData(dsinf_10));
        inlineRows.add(inlineRow);
        inlineRow=new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(sinf_11).setCallbackData(dsinf_11));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TestTopshirish() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(testTopshirish).setCallbackData(testTopshirish).setUrl("http://t.me/TestTopshirishMaktabBot"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
    static public InlineKeyboardMarkup TestTuzish() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> inlineRows = new ArrayList<List<InlineKeyboardButton>>();
        List<InlineKeyboardButton> inlineRow = new ArrayList<InlineKeyboardButton>();
        inlineRow.add(new InlineKeyboardButton(testTopshirishgaOtish).setCallbackData(testTopshirishgaOtish).setUrl("https://t.me/quizbot"));
        inlineRows.add(inlineRow);
        inlineKeyboardMarkup.setKeyboard(inlineRows);
        return inlineKeyboardMarkup;
    }
}

