import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean interval1 = number > -15 && number <= 12;
        boolean interval2 = number > 14 && number < 17;
        boolean interval3 = number >= 19;

        if (interval1 || interval2 || interval3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}