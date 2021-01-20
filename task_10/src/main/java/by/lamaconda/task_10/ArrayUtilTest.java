package by.lamaconda.task_10;

 class ArrayUtilTest {
     public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldReturnOne();
        arrayUtilTest.shouldReturnTwo();
        arrayUtilTest.shouldReturnThree();
     }

     ArrayUtil arr = new ArrayUtil();

     int[] array = {5, 10, 2, 0, 5, 5, 2};

     public void shouldReturnOne() {
         int expected = 1;
         int actual = arr.countSameNumbersInArray(array,10);
         checkResult(expected==actual,"shouldReturnOne");
     }

     public void shouldReturnTwo() {
         int expected = 2;
         int actual = arr.countSameNumbersInArray(array,2);
         checkResult(expected==actual,"shouldReturnTwo");
     }

     public void shouldReturnThree() {
         int expected = 3;
         int actual = arr.countSameNumbersInArray(array,5);
         checkResult(expected==actual,"shouldReturnThree");
     }


     public void checkResult(boolean condition, String testName) {
         if (condition) {
             System.out.println(testName + " = SUCCESS");
         } else {
             System.out.println(testName + " = FAILED");
         }
     }
}
