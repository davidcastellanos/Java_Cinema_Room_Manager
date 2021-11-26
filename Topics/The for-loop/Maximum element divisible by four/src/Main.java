import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int qnt = scanner.nextInt();
        int num;
        int divider = 4;
        int maxNum = 0;

        for (int i = 1; i <= qnt; i++) {
            num = scanner.nextInt();

            if (num % divider == 0 && num > maxNum) {
                maxNum = num;
            }
        }

        System.out.println(maxNum);
    }
}