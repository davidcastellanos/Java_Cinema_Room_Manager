package cinema;

import java.util.Objects;
import java.util.Scanner;

public class Cinema {
    /*Main function Start*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Array creation start*/
        System.out.println("Enter the number of rows:");
        int numOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numOfSeats = scanner.nextInt();
        String[][] roomMatrix = new String[numOfRows + 1][numOfSeats + 1];
        /*Array creation End*/

        /*List of variables to use in the different methods - Start*/
        boolean menuActivated = true;
        int totalSeats = numOfRows * numOfSeats;
        //
        /*List of variables to use in the different methods - End*/

        if (numOfRows < 0 || numOfSeats < 0) { //Prevent array size exception
            System.out.println("Negative size of room");
        } else {
            createRoom(roomMatrix);
            showMenu(menuActivated, roomMatrix, numOfRows, numOfSeats, totalSeats);
        }
    }
    /*Main function End*/


    /*First step, creating a Cinema Room*/
    public static void createRoom(String[][] roomMatrix) {
        for (int i = 0; i < roomMatrix.length; i++) {
            for (int j = 0; j < roomMatrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    roomMatrix[i][j] = " ";
                } else if (i == 0) {
                    roomMatrix[0][j] = String.valueOf(j);
                } else if (j == 0) {
                    roomMatrix[i][0] = String.valueOf(i);
                } else {
                    roomMatrix[i][j] = "S";
                }
            }
        }

    }

    /*Second step, Program Menu*/
    public static void showMenu(boolean menuActivated, String[][] roomMatrix, int numOfRows, int numOfSeats, int totalSeats) {

        while (menuActivated) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int option = scanner.nextInt();
            int selectedRow;
            int selectedSeat;

            switch (option) {
                case 0:
                    menuActivated = false;
                    break;
                case 1:
                    showMatrix(roomMatrix);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    while (true) {
                        System.out.println("Enter a row number:");
                        selectedRow = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        selectedSeat = scanner.nextInt();

                        if ((selectedRow > numOfRows && selectedSeat > numOfSeats) ||
                                (selectedRow < 1 && selectedSeat < 1) ||
                                (selectedRow < numOfRows && selectedSeat > numOfSeats)||
                                (selectedRow > numOfRows && selectedSeat < numOfSeats)) {
                            System.out.println("Wrong input!\n");

                        } else if (Objects.equals(roomMatrix[selectedRow][selectedSeat], "B")) {
                            System.out.println("That ticket has already been purchased!\n");

                        } else {
                            chosenSeat(selectedRow, selectedSeat, roomMatrix);
                            System.out.printf("Ticket price: $%s\n", ticketPrice(numOfRows, numOfSeats, selectedRow));
                            break;

                        }

                    }
                    break;
                case 3:
                    System.out.printf("Number of purchased tickets: %d\n", numOfPurchasedTickets(roomMatrix));
                    System.out.printf("Percentage: %s%c\n", percentage(numOfRows, numOfSeats, roomMatrix),'%');
                    System.out.printf("Current income: $%d\n", currentIncome(roomMatrix));
                    System.out.printf("Total income: $%d\n\n", totalIncome(totalSeats, numOfRows, numOfSeats));
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;

            }

        }


    }

    /*Third step - Show the Matrix*/
    public static void showMatrix(String[][] roomMatrix) {
        System.out.println("Cinema:");
        for (String[] row : roomMatrix) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }


    /*Fourth step - Calculating ticket price*/
    public static int ticketPrice(int numOfRows, int numOfSeats, int selectedRow) {
        int totalSeats = numOfRows * numOfSeats;
        int frontRows;
        int backRows;
        final int divideRoom = 2;
        final int highPrice = 10;
        final int lowPrice = 8;
        int income;

        if (totalSeats <= 60) {
            income = highPrice;

        } else if (numOfRows % divideRoom != 0) {
            backRows = numOfRows / divideRoom + 1;
            income = selectedRow < backRows ? highPrice : lowPrice;


        } else {
            frontRows = numOfRows / divideRoom;
            income = selectedRow <= frontRows ? highPrice : lowPrice;

        }

        System.out.println();
        return income;

    }


    /*Fifth step - Choosing a chair and labeling it with the letter B*/
    public static void chosenSeat(int selectedRow, int selectedSeat, String[][] roomMatrix) {
        for (int i = 0; i < roomMatrix.length; i++) {
            for (int j = 0; j < roomMatrix[i].length; j++) {
                if (i == selectedRow && j == selectedSeat) {
                    roomMatrix[i][j] = "B";
                    break;
                }
            }
        }
    }

    /*Sixth step - Number of purchased tickets*/
    public static int numOfPurchasedTickets(String[][] roomMatrix) {
        int counter = 0;
        for (String[] rows : roomMatrix) {
            for (String seats : rows) {
                if (Objects.equals(seats, "B")) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /*Seventh step - Calculate the percentage*/
    public static String percentage(float numOfRows, float numOfSeats, String[][] roomMatrix) {
        int counter = 0;

        for (String[] rows : roomMatrix) {
            for (String seat : rows) {
                if (Objects.equals(seat, "B")) {
                    counter++;
                }
            }
        }
        return String.format("%.2f", (counter * 100) / (numOfRows * numOfSeats));
    }

    /*Eighth step - Check sold tickets and accumulate income*/
    public static int currentIncome(String[][] roomMatrix) {

        int roomRowsLength = roomMatrix.length;
        int backRoom;
        int frontRoom;
        final int frontValue = 10;
        int accumFront = 0;
        final int backValue = 8;
        int accumBack = 0;

        /*Check that the size of the room is less than 60 and the number of tickets sold. Assigning the price of 10 per ticket.*/
        for (String[] rows : roomMatrix) {
            for (String seat : rows) {
                if ((roomRowsLength - 1) * (roomRowsLength - 1) <= 60) {
                    if (Objects.equals(seat, "B")) {
                        accumFront += frontValue;
                    }

                }
            }
        }

        /*Check that the size of the room is greater than 60*/
        if ((roomRowsLength - 1) * (roomRowsLength - 1) > 60) {
            frontRoom = roomRowsLength / 2;
            backRoom = roomRowsLength / 2;
            /*Assigning the price of 10 to the first half of the room*/
            for (int i = 0; i < frontRoom; i++) {
                for (int j = 0; j < roomMatrix[i].length; j++) {
                    if (Objects.equals(roomMatrix[i][j], "B")) {
                    accumFront += frontValue;
                    }
                }
            }

            /*Assigning the price of 8 to the second half of the room*/
            for (int i = backRoom; i < roomRowsLength; i++) {
                for (int j = 0; j < roomMatrix[i].length; j++) {
                    if (Objects.equals(roomMatrix[i][j], "B")) {
                        accumBack += backValue;
                    }
                }
            }
        }
        return accumFront + accumBack;

    }


    /*Ninth step - TOTAL INCOME*/
    public static int totalIncome(int totalSeats, int numOfRows, int numOfSeats) {
        int totalIncome = 0;
        if (totalSeats < 60) {
            totalIncome = numOfRows * numOfSeats * 10;

        } else if (totalSeats > 60) {
            int totalIncomeFirstHalf = numOfRows / 2 * numOfSeats * 10;
            int totalIncomeBackRows = (numOfRows - (numOfRows / 2)) * numOfSeats * 8;
            totalIncome = totalIncomeFirstHalf + totalIncomeBackRows;
        }
        return totalIncome;
    }
}

