import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //         // in chess queen can move diagonally, vertically, horizontally
        //        // so either the same y's and same x's and
        // So need 3 types of checks - one check for vertically, one check for horizontally, one diagonal
        // checking horizontally would be if their X values are the same
        // touching vertically would be if their Y values are the same
        // one check for diagonally < - this is the hardest
        // what is horizontally
        // at point 4,4 diagonally would be
        //
        // 2,6          6,6
        //    3,5    5,5
        //       4,4
        //    3,3    5,3
        // 2,1          6,2
        // kinda hard to see the pattern between the diagonals
        // lets try starting at 0,0

        // -2,2           2,2
        //    -1,1     1,1
        //         0,0
        //   -1,-1     1,-1
        //-2,-2             2,-2
        //im overthinking this
        //
        // diagonal - if the difference between the two points is zero
        // so checking the diagonal means checking the absolute value of the two points
        // abs(x1)-abs(x2) = abs(y1)-abs(y2)
        // if only one combination is true then return true
        // so we need to expressions a = b | c = d
        // for the points part the terms equal should be x seperately from y
        // so x1,y1 x2,y2
        // a == c || c == d
        //

        // if X's are equal OR Y's are equal


    }
}