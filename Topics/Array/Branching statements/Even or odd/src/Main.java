import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = 1;

        while (number != 0) {
            number = scanner.nextInt();

            if (number != 0) {
                if (number % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        }
    }
}