public class Exercise_3 {
//    over-ride / overload
    public Exercise_3() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 3, 5, 7, 8, 9, -2, -3};
        int sum_1 = 7, sum_2 = 3;

        printPairs_exercise_3(numbers, sum_1);
        printPairs_exercise_3(numbers, sum_1, sum_2);
    }

    public static void printPairs_exercise_3(int[] array, int sum) {
        for (int i = 0; i < array.length - 1; ++i) {
            int first = array[i];
            for (int j = 0; j < array.length; ++j) {
                int second = array[j];
                if (first + second == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }

    }

    public static void printPairs_exercise_3(int[] array, int sum, int sum_2){

    }
}