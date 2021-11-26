import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        hour = hour2 * 3600 - hour * 3600;
        minutes = minutes2 * 60 - minutes * 60;
        seconds = seconds - seconds2;

        System.out.print(hour + minutes - seconds);

    }
}