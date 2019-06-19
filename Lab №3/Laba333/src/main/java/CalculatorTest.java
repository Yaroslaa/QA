import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testDiv(){
        double result = calculator.Div(2,2);
        double expectedRes = 1;
        Assert.assertEquals(expectedRes,result,0);
    }

    @Test
    public void testMul(){
        double result = calculator.Mul(2,2);
        double expectedRes = 4;
        Assert.assertEquals(expectedRes,result,0);
    }

    @Test
    public void testSum(){
        double result = calculator.Sum(2,10);
        double expectedRes = 12;
        Assert.assertEquals(expectedRes,result,0);
    }

}