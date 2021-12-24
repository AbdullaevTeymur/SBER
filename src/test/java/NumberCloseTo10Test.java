import com.sun.media.jfxmedia.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class NumberCloseTo10Test {

    private int[] array1 = {-10, 15, 8, 7, 12, 5, 9};
    private int[] array2 = {154556465, -10, 999, 12131345, -8889897, 5465654, 90};
    private int[] array3 = {154556465};


    @DataProvider
    public Object[][] dataPositive() {
        return new Object[][]{
                {array1, 9},
                {array2, -10},
                {array3, 154556465},
        };
    }

    @Test(dataProvider = "dataPositive")
    public void numberCloseTo10PositiveTest(int[] array, int number) {
        Assert.assertEquals(NumberCloseTo10.numberCloseTo10(array), number);
        LOGGER.info("Проверка возвращаемого значения функции numberCloseTo10 для массива " + Arrays.toString(array) + " - " + "\"" + number + "\"");
    }

}
