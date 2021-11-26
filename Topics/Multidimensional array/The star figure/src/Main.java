import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[][] array = new char[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == n / 2 || i == n / 2 || j == i || j == n - (i + 1)) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = '.';
                }
            }
        }

        for (char[] nestedArray : array) {
            for (char aChar : nestedArray) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }




    }
}