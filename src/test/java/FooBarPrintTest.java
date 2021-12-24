import org.testng.Assert;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FooBarPrintTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {0,"foobar"},
                {3,"bar"},
                {5,"foo"},
                {15,"foobar"},
                {null,"Значение предаваемого числа в аргумент метода равно null"},
        };
    }

    @BeforeTest
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test(dataProvider = "data")
    public void fooBarPrintTest(Integer number, String answer) {
        System.setOut(new PrintStream(output));
        FooBar.fooBarPrint(number);
        Assert.assertEquals(output.toString().trim(), answer);
        System.setOut(null);
    }

    @AfterTest
    public void cleanUpStreams() {
        System.setOut(null);
    }
}


