import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TranspositionStringTest {

    @DataProvider
    private Object[][] data(){
        return new Object[][]{
                {"",""},
                {"123 ","123 "},
                {"s 2 f","fs  2"},
        };
    }

    @Test(dataProvider = "data")
    public void isTranpositionStringTrueTest(String one,String two){
        Assert.assertTrue(TranspositionStringClass.isTranspositionString(one, two));
    }
    @Test
    public void isTranpositionStringFalseTest(){
        Assert.assertFalse(TranspositionStringClass.isTranspositionString("sfg","sfd"));
    }
}
