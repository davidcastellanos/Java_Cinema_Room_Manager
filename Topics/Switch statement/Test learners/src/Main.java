import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2: //merge cases with the same answers
            case 4:
            case 3:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}