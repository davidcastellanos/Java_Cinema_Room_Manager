import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        int result = 0;

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int elem: arr) {
            result += elem;
        }

        System.out.println(result);
    }
}