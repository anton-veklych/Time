import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.*;

/**
 * Created by ASUS on 13.02.2016.
 */
public class Time {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Time.class.getName());
        try {
            LogManager.getLogManager().readConfiguration(Time.class.getResourceAsStream("/logger.properties"));
        } catch (IOException e){
            logger.log(Level.SEVERE, "Не удалось создать файл лога", e);
        }


        Date currentTime = new Date();

        Calendar morningMIN = Calendar.getInstance();
        morningMIN.set(Calendar.HOUR_OF_DAY,  6);
        morningMIN.set(Calendar.MINUTE, 0);
        morningMIN.set(Calendar.MILLISECOND, 0);


        Calendar morningMAX = Calendar.getInstance();
        morningMAX.set(Calendar.HOUR_OF_DAY,  9);
        morningMAX.set(Calendar.MINUTE, 0);
        morningMAX.set(Calendar.MILLISECOND, 0);

        Calendar dayMIN = Calendar.getInstance();
        dayMIN.set(Calendar.HOUR_OF_DAY,  9);
        dayMIN.set(Calendar.MINUTE, 0);
        dayMIN.set(Calendar.MILLISECOND, 0);

        Calendar dayMAX = Calendar.getInstance();
        dayMAX.set(Calendar.HOUR_OF_DAY,  19);
        dayMAX.set(Calendar.MINUTE, 0);
        dayMAX.set(Calendar.MILLISECOND, 0);

        Calendar eveningMIN = Calendar.getInstance();
        eveningMIN.set(Calendar.HOUR_OF_DAY,  19);
        eveningMIN.set(Calendar.MINUTE, 0);
        eveningMIN.set(Calendar.MILLISECOND, 0);

        Calendar eveningMAX = Calendar.getInstance();
        eveningMAX.set(Calendar.HOUR_OF_DAY, 23);
        eveningMAX.set(Calendar.MINUTE, 0);
        eveningMAX.set(Calendar.MILLISECOND, 0);

        Calendar nightMIN = Calendar.getInstance();
        nightMIN.set(Calendar.HOUR_OF_DAY, 23);
        nightMIN.set(Calendar.MINUTE, 0);
        nightMIN.set(Calendar.MILLISECOND, 0);

        Calendar nightMAX = Calendar.getInstance();
        nightMAX.add(Calendar.DAY_OF_YEAR, 1);
        nightMAX.set(Calendar.HOUR_OF_DAY, 6);
        nightMAX.set(Calendar.MINUTE, 0);
        nightMAX.set(Calendar.MILLISECOND, 0);
        logger.info("Установили временные интервалы");



        Locale localeDefault =  Locale.ENGLISH;


        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources", localeDefault.getDefault());
        logger.info("Опредиления языка пользователя");

        logger.info("Вывод сообщения");
        String st = showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime);
        String string = resourceBundle.getString(st);
        System.out.println(string);
        logger.info("Сообщение выведено");



    }


    public static String showMessage(Calendar morningMIN, Calendar morningMAX, Calendar dayMIN, Calendar dayMAX, Calendar eveningMIN, Calendar eveningMAX, Calendar nightMIN, Calendar nightMAX, Date currentTime){
        if(morningMIN.getTime().getTime()< currentTime.getTime() && currentTime.getTime() <= morningMAX.getTime().getTime()){
            String st = "morning";
            return st;
        } else if(dayMIN.getTime().getTime()< currentTime.getTime() && currentTime.getTime() <= dayMAX.getTime().getTime()) {
            String st = "day";
            return st;
        } else if(eveningMIN.getTime().getTime()< currentTime.getTime() && currentTime.getTime() <= eveningMAX.getTime().getTime()){
            String st = "evening";
            return st;
        } else if(nightMIN.getTime().getTime()< currentTime.getTime() && currentTime.getTime() <= nightMAX.getTime().getTime()){
            String st = "night";
            return st;
        } else {
            String st = "Warning";
            return st;
        }
    }
}
