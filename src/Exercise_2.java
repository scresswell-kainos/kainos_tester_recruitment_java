public class Exercise_2 {
    public Exercise_2() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 3, 5, 7, 8, 9, -2, -3};
        byte sum = 7;
        printPairs_exercise_2(numbers, sum);
    }

    public static void printPairs_exercise_2(int[] array, int sum) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array.length; ++j) {
                if(array[i] + array[j] == sum) {
                    System.out.printf("%d + %d = %d %n", array[i], array[j], sum);
                }
            }
        }

    }
}