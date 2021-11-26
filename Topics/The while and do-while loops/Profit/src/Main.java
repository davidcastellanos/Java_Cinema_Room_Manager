import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        float m = scanner.nextInt();
        float p = scanner.nextInt();
        int k = scanner.nextInt();
        int counter = 0;
        int auxPercent = 100;

        while (m < k) {
            m += m * (p / auxPercent);
            counter++;
        }

        System.out.println(counter);
    }
}