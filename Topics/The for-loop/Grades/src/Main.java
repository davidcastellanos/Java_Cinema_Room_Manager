import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int grades = scanner.nextInt();
        int grade;
        int a = 5;
        int b = 4;
        int c = 3;
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        String result;

        for (int i = 1; i <= grades; i++) {
            grade = scanner.nextInt();

            if (grade == a) {
                counterA++;
            } else if (grade == b) {
                counterB++;
            } else if (grade == c) {
                counterC++;
            } else {
                counterD++;
            }
        }

        result = String.format("%s %s %s %s", counterD, counterC, counterB, counterA);
        System.out.println(result);
    }
}