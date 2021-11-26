import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        int a;
        int b;
        boolean result = false;



        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        if (arr.length == 1) {
            result = true;

        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                a = arr[i];
                b = arr[i + 1];

                if (a > b) {
                    result = false;
                    break;

                } else {
                    result = true;
                }
            }

        }

        System.out.println(result);
    }
}