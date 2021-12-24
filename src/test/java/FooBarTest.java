import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class FooBarTest {

    @DataProvider
    public Object[][] dataPositive(){
        return new Object[][]{
                {0,"foobar"},
                {3,"bar"},
                {5,"foo"},
                {15,"foobar"},
                {-15,"foobar"}
        };
    }

    @Test(dataProvider = "dataPositive")
    public void fooBarPositiveTests(Integer number, String answer){
        LOGGER.info("Позитивная проверка функции fooBar");
        Assert.assertEquals(FooBar.fooBar(number),answer);
    }

    @Test(expectedExceptions = {NullPointerException.class})
    public void fooBarNegativeNullTest(){
        LOGGER.info("Негативная проверка функции fooBar c значением null");
        FooBar.fooBar(null);
    }

}
