import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int divider = 3;
        float acumulator = 0;
        float counter = 0;
        float result;

        for (int i = a; i <= b; i++) {
            if (i % divider == 0) {
                acumulator += i;
                counter++;
            }
        }
        result = acumulator / counter;
        System.out.println(result);
    }
}