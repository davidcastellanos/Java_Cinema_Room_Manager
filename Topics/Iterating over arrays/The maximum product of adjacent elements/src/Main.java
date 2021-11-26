import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt();
        int[] array = new int[arrLength];
        int j = 1;
        int nextElement;
        int result = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        for (int element: array) {
            while (j <= array.length - 1) {
                nextElement = array[j];

                if (element * nextElement > result) {
                    result = element * nextElement;
                }

                j++;
                break;
            }

        }

        System.out.println(result);
    }
}