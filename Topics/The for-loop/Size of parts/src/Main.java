import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int qnt = scanner.nextInt();
        int part;
        int large = 1;
        int largeCounter = 0;
        int smaller = -1;
        int smallerCounter = 0;
        int perfectCounter = 0;
        String message;

        for (int i = 1; i <= qnt; i++) {
            part = scanner.nextInt();

            if (part == large) {
                largeCounter++;
            } else if (part == smaller) {
                smallerCounter++;
            } else {
                perfectCounter++;
            }

        }

        message = String.format("%s %s %s", perfectCounter, largeCounter, smallerCounter);
        System.out.println(message);
    }
}