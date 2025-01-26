package Backtracking.Questions.MazePath;

/*
 * Rat in a maze-1 [2-directions (Go Right/Go Down)]
 */
public class MazePath {
    public static int CountMazePath(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec)
            return 0;
        if (sr == er && sc == ec)
            return 1;
        int downWays = CountMazePath(sr + 1, sc, er, ec);
        int rightWays = CountMazePath(sr, sc + 1, er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }

    public static void PrintAllMazePath(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        // go down
        PrintAllMazePath(sr + 1, sc, er, ec, s + "D");
        // go right
        PrintAllMazePath(sr, sc + 1, er, ec, s + "R");
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = CountMazePath(1, 1, rows, cols);
        System.out.print("Number of paths are: " + count);
        System.out.println();
        System.out.println("All paths are: ");
        PrintAllMazePath(1, 1, rows, cols, " ");
    }
}