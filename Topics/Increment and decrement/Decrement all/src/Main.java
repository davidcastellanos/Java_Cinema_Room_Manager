import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        --num1;
        --num2;
        --num3;
        --num4;

        String result = String.format("%s %s %s %s", num1, num2, num3, num4);
        System.out.println(result);
    }
}