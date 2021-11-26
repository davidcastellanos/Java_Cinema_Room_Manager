import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        /*if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/
        boolean condition1 = a + b > c;
        boolean condition2 = a + c > b;
        boolean condition3 = b + c > a;

        System.out.println(condition1 && condition2 && condition3 ? "YES" : "NO");
    }
}