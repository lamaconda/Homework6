package by.lamaconda.task_9;

public class ArrayUtilTest {
    private final ArrayUtil ar = new ArrayUtil();
    private final int arrayLength = 10;

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.isWhetherAnArraySpecifiedNumberTrue();
        arrayUtilTest.isWhetherAnArraySpecifiedNumberFalse();
    }

    public void isWhetherAnArraySpecifiedNumberTrue() {
        boolean expected = true;
        boolean actual = ar.isArrayContainsUserNum(arrayLength, 0);
        checkResult(expected == actual, "isWhetherAnArraySpecifiedNumberTrue");
    }

    public void isWhetherAnArraySpecifiedNumberFalse() {
        boolean expected = false;
        boolean actual = ar.isArrayContainsUserNum(arrayLength, 10);
        checkResult(expected == actual, "isWhetherAnArraySpecifiedNumberFalse");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
