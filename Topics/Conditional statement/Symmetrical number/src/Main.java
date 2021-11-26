import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        /*int n = scanner.nextInt();
        int d1 = n / 1000;
        int d2 = n / 100 % 10;
        int d3 = n / 10 % 10;
        int d4 = n % 10;

        if (d1 == d4 && d2 == d3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }*/

        if (number.length() == 4) {
            if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)) {
                System.out.println(1);
            } else {
                System.out.println(8);
            }

        }
    }
}