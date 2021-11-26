import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}