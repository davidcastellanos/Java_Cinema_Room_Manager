import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int divider = 2;
        int result;

        if (num1 % 2 == 0) {
            num1 = num1 / divider;
        } else {
            num1 = num1 / divider + 1;
        }


        if (num2 % 2 == 0) {
            num2 = num2 / divider;
        } else {
            num2 = num2 / divider + 1;
        }



        if (num3 % 2 == 0) {
            num3 = num3 / divider;
        } else {
            num3 = num3 / divider + 1;
        }

        result = num1 + num2 + num3;

        System.out.println(result);

    }
}