import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String number = scanner.next();

        char firstDigit = number.charAt(0);
        char secondDigit = number.charAt(1);
        char thirdDigit = number.charAt(2);

        int digitOne = Character.getNumericValue(firstDigit);
        int digitTwo = Character.getNumericValue(secondDigit);
        int digitThree = Character.getNumericValue(thirdDigit);

        System.out.println(digitOne + digitTwo + digitThree);
    }
}