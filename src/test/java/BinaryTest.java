import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BinaryTest {

    @DataProvider
    public Object[][] testDataPositiveToBinary() {
        return new Object[][]{
                {0, "0"},
                {2147483647, "1111111111111111111111111111111"},
        };
    }


    @Test(dataProvider = "testDataPositiveToBinary")
    public void toBinaryPositiveTest(int decimal, String binary) {
        Assert.assertEquals(BinaryClass.toBinary(decimal), binary);
    }
}

