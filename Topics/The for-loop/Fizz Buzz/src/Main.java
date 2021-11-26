import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int startIncl = scanner.nextInt();
        int endIncl = scanner.nextInt();

        int num3 = 3;
        int num5 = 5;

        for (int i = startIncl; i <= endIncl; i++) {
            /*if (i % num3 == 0 && i % num5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % num3 == 0) {
                System.out.println("Fizz");
            } else if (i % num5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }*/

            System.out.println(i % num3 == 0 && i % num5 == 0 ? "FizzBuzz" :
                    i % num3 == 0 ? "Fizz" :
                            i % num5 == 0 ? "Buzz" : i);
        }

    }
}