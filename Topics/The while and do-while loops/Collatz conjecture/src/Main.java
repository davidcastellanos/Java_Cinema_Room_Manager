import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int one = 1;
        int two = 2;
        int three = 3;
        System.out.print(number + " ");

        do {
            if (number % two == 0) {
                number = number / two;
                System.out.print(number + " ");
            } else if (number != one) {
                number = number * three + one;
                System.out.print(number + " ");
            }
        } while (number != one);

    }
}