import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String room = scanner.next();

        switch (room) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                triangleArea(a, b, c);
                break;
            case "rectangle":
                double s = scanner.nextDouble();
                double h = scanner.nextDouble();
                rectangleArea(s, h);
                break;
            case "circle":
                double r = scanner.nextDouble();
                circleArea(r);
                break;
            default:
                System.out.println("I love Malevia");
                break;
        }
    }

    public static void triangleArea(double a, double b, double c) {
        double perimeter = a + b + c;
        double semiP = perimeter / 2;
        double trArea = Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
        System.out.println(trArea);
    }

    public static void rectangleArea(double s, double h) {
        double recArea = s * h;
        System.out.println(recArea);
    }

    public static void circleArea(double r) {
        double pi = 3.14;
        double cirArea = pi * (r * r);
        System.out.println(cirArea);

    }

}