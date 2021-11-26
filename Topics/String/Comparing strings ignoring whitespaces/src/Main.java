import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstWord = scanner.nextLine().replace(" ", "");
        String secondWord = scanner.nextLine().replace(" ", "");

        boolean result = firstWord.equals(secondWord);
        System.out.println(result);

    }
}