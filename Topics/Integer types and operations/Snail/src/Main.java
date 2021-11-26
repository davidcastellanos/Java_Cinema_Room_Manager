import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int heightPole = scanner.nextInt();
        int upPerDay = scanner.nextInt();
        int downPerNight = scanner.nextInt();


        int formula = (heightPole - downPerNight - 1) / (upPerDay - downPerNight) + 1;

        System.out.println(formula);


    }
}