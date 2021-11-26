import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int peanutBCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean result;

        result = isWeekend ? peanutBCups >= 15 && peanutBCups <= 25 : peanutBCups >= 10 && peanutBCups <= 20;
        /*(peanutButterCups >= 10 && peanutButterCups <= 20 && isWeekend == false) == true ? true :
        (peanutButterCups >= 15 && peanutButterCups <= 25 && isWeekend == true) == true ?  true : false;*/

        System.out.println(result);


    }
}