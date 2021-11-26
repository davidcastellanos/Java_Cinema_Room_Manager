import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text = scanner.next().toLowerCase();
        boolean result = text.startsWith("j");
        System.out.println(result);
    }
}