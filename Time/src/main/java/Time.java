import java.io.IOException;
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
            logger.log(Level.SEVERE, "Failed to create the log file", e);
        }


        Date currentTime = new Date();
        TimeIntervals timeIntervals = new TimeIntervals();

        Locale locale =  Locale.getDefault();

        Message message = new Message();
        ResourceBundle resourceBundle = message.showResource(locale);
        logger.info("The definitions of the user's language");

        logger.info("Showing a message");
        String string = resourceBundle.getString(message.showMessage(timeIntervals, currentTime));
        System.out.println(string);
        logger.info("Message displayed");

    }

    }

