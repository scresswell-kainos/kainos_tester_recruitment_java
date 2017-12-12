public class X_Exemplar {
    public X_Exemplar() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 3, 5, 7, 8, 9, -2, -3};
        byte sum = 7;
        printPairs(numbers, sum);
    }

    public static void printPairs(int[] array, int sum) {
        for(int i = 0; i < array.length; ++i) {
            int first = array[i];

            for(int j = i + 1; j < array.length; ++j) {
                int second = array[j];
                if(first + second == sum) {
                    System.out.printf("(%d, %d) %n", new Object[]{Integer.valueOf(first), Integer.valueOf(second)});
                }
            }
        }

    }
}