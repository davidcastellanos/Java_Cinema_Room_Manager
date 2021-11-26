import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = 1;
        int acum = 0;

        while (acum <= n) {
            acum = x * x;
            if (acum <= n) {
                System.out.println(acum);
            }
            x++;
        }

    }
}