import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt(); // Defining the length of the array
        int[] arr = new int[arrLength]; // Instantiating the array [0...0]
        int sum = 0; // result

        /*Adding numbers to the array*/
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt(); // n is the condition

        /*Iterating the array and checking which numbers are greater than "n"
        to make the sum*/
        for (int value: arr) {
            if (value > n) {
                sum = sum + value;
            }
        }

        System.out.println(sum);

    }
}