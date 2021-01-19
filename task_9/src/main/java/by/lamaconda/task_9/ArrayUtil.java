package by.lamaconda.task_9;

public class ArrayUtil {

    public boolean isArrayContainsUserNum(int arrayLength, int number) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
