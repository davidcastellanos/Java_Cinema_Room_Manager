import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] twoDimArray = new int[rows][columns];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int indexI = scanner.nextInt();
        int indexJ = scanner.nextInt();

        swapCol(indexI, indexJ, twoDimArray);


        for (int[] ints : twoDimArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }

    public static void swapCol(int c1, int c2, int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int temp = twoDimArray[i][c1];
            twoDimArray[i][c1] = twoDimArray[i][c2];
            twoDimArray[i][c2] = temp;
        }
    }


}