import org.junit.Assert;
import org.junit.Test;


import java.util.Calendar;
import java.util.Date;

/**
 * Created by adm on 15.02.2016.
 */
public class MainTest {
    @Test
    public void mainTest() throws Exception{
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

        Calendar currentTime = Calendar.getInstance();
        currentTime.set(Calendar.HOUR_OF_DAY, 7);
        currentTime.set(Calendar.MINUTE, 0);
        currentTime.set(Calendar.MILLISECOND, 0);



        Assert.assertEquals("morning", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.set(Calendar.HOUR_OF_DAY, 14);
        Assert.assertEquals("day", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.set(Calendar.HOUR_OF_DAY, 20);
        Assert.assertEquals("evening", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.set(Calendar.HOUR_OF_DAY, 9);
        Assert.assertEquals("morning", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.set(Calendar.HOUR_OF_DAY, 19);
        Assert.assertEquals("day", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.set(Calendar.HOUR_OF_DAY, 23);
        Assert.assertEquals("evening", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.add(Calendar.DAY_OF_YEAR, 1);
        currentTime.set(Calendar.HOUR_OF_DAY, 1);
        Assert.assertEquals("night", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));
        currentTime.set(Calendar.HOUR_OF_DAY, 6);
        Assert.assertEquals("night", Time.showMessage(morningMIN, morningMAX, dayMIN, dayMAX, eveningMIN, eveningMAX, nightMIN, nightMAX, currentTime.getTime()));


    }
}
