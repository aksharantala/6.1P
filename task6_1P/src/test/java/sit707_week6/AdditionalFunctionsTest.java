// AdditionalFunctionsTest.java

package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class AdditionalFunctionsTest {

    @Test
    public void testSumOfSquaresUpToN() {
        Assert.assertEquals(14, AdditionalFunctions.sumOfSquaresUpToN(3));
        Assert.assertEquals(0, AdditionalFunctions.sumOfSquaresUpToN(0));
        Assert.assertEquals(0, AdditionalFunctions.sumOfSquaresUpToN(-3));
    }

    @Test
    public void testCountEvenNumbersUpToN() {
        Assert.assertEquals(3, AdditionalFunctions.countEvenNumbersUpToN(6));
        Assert.assertEquals(0, AdditionalFunctions.countEvenNumbersUpToN(0));
        Assert.assertEquals(0, AdditionalFunctions.countEvenNumbersUpToN(-6));
    }
}
