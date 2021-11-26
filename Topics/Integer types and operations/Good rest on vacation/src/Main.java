import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationDays = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nights = durationDays - 1;
        int nightHotelCost = scanner.nextInt();
        int totalCost;

        foodPerDay = foodPerDay * durationDays;
        flightCost = flightCost * 2;
        nightHotelCost = nightHotelCost * nights;

        totalCost = foodPerDay + flightCost + nightHotelCost;

        System.out.println(totalCost);
        
    }
}