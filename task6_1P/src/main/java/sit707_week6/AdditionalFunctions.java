// AdditionalFunctions.java

package sit707_week6;

public class AdditionalFunctions {

    /**
     * Function with a conditional loop (for loop) and simple instructions in the loop body.
     * 
     * @param n
     * @return
     */
    public static int sumOfSquaresUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Function with a conditional loop and a conditional statement in the loop body.
     * 
     * @param n
     * @return
     */
    public static int countEvenNumbersUpToN(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
