package by.lamaconda.task_10;

 class ArrayUtil {

    public int countSameNumbersInArray(int[] array, int number) {
        int count = 0;
        for (int i : array) {
            if (number == i) {
                count++;
            }
        }return count;
    }
}
