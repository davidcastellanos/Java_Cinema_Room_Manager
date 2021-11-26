import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int qnt = scanner.nextInt();
        int i = 1;
        int maxNum = 0;
        int four = 4;

        while (i <= qnt) {
            int num = scanner.nextInt();

            if (num % four == 0 && num > maxNum) {
                maxNum = num;
            }
            i++;
        }
        System.out.println(maxNum);
    }
}