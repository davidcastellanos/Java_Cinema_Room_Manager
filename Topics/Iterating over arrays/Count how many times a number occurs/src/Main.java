import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt(); // array length
        int[] arr = new int[arrLength]; // [0,0...0]
        int counter = 0; // 0

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); // [n...n]
        }

        int n = scanner.nextInt();

        /*Comparing the elements of the array and increasing
        the counter if there are equal elements*/
        for (int value: arr) {
            if (value == n) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}