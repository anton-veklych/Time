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

        TimeIntervals tm = new TimeIntervals();
        Calendar currentTime = Calendar.getInstance();

        currentTime.set(Calendar.HOUR_OF_DAY, 7);
        Assert.assertEquals("morning", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 14);
        Assert.assertEquals("day", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 20);
        Assert.assertEquals("evening", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 4);
        Assert.assertEquals("night", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 9);
        Assert.assertEquals("day", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 19);
        Assert.assertEquals("evening", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 23);
        Assert.assertEquals("night", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 1);
        Assert.assertEquals("night", new Message().showMessage(tm, currentTime.getTime()));

        currentTime.set(Calendar.HOUR_OF_DAY, 6);
        Assert.assertEquals("morning", new Message().showMessage(tm, currentTime.getTime()));

    }
}
