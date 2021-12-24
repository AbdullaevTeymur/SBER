import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaxNumberTest {
    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {1,5,5},
                {0,-1,0},
                {5,-5,5},
                {-7,-6,-6},
                {5,5,5},
                {-1,2000000000,2147483647}
        };
    }

    @Test(dataProvider = "data")
    public void maxTest(int a, int b, int result){
        Assert.assertEquals(MaxNumberClass.maximum(a,b),result,"Функция работает неверно");
    }

}
