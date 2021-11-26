import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        for (int value: array) {
            if (value == number) {
                result = true;
            }
        }

        System.out.println(result);
    }
}