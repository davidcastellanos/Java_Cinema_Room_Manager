import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int iterations = scanner.nextInt();
        int divider = 6;
        int acum = 0;

        for (int i = 1; i <= iterations; i++) {
            int number = scanner.nextInt();

            if (number % divider == 0) {
                acum = acum + number;
            }
        }

        System.out.println(acum);
    }
}