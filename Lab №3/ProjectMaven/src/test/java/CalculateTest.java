import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CalculateTest {
    Calculator calculator = new Calculator();

    @Test
    public void TestDiv(){
        double result = calculator.Division(123,0);
        double expectedresult = Infinity;
        Assert.assertEquals(expectedresult, result,0);
    }

}
