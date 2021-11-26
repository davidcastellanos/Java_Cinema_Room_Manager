import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int tripleCounter = 0;

        for (int i = 2; i < array.length; i++) {
            int a = array[i];
            int b = array[i - 1];
            int c = array[i - 2];

            if (a - b == 1 && b - c == 1) {
                tripleCounter++;
            }
        }

        System.out.println(tripleCounter);
    }
}