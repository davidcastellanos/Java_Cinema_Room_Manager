import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        int a;
        int b;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            a = arr[i];
            b = arr[i + 1];

            if (n == a && m == b || n == b && m == a) {
                System.out.println(false);
                break;
            } else if (a == arr[arr.length - 2] && b == arr[arr.length - 1]) {
                System.out.println(true);
            }
        }
    }
}