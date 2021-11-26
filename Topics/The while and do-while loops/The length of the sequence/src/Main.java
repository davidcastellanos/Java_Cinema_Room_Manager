import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int counter = 0;

        while (n != 0) {
            n = scanner.nextInt();
            if (n != 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}