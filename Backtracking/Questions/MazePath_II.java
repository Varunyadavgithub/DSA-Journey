package Backtracking.Questions;

/*
 * Rat in a maze-2 [4-directions (Go Left/Go Right and Go Up/Go Down)]
 */
public class MazePath_II {

    public static int CountMazePath(int sr, int sc, int er, int ec, boolean[][] isVisited) {
        // Base cases:
        // If out of bounds
        if (sr < 0 || sc < 0 || sr > er || sc > ec) {
            return 0;
        }
        // If the cell is already visited
        if (isVisited[sr][sc]) {
            return 0;
        }
        // If we have reached the destination
        if (sr == er && sc == ec) {
            return 1;
        }

        // Mark the current cell as visited
        isVisited[sr][sc] = true;

        // Count paths by moving in all four directions
        int count = 0;
        // Move right
        count += CountMazePath(sr, sc + 1, er, ec, isVisited);
        // Move left
        count += CountMazePath(sr, sc - 1, er, ec, isVisited);
        // Move up
        count += CountMazePath(sr - 1, sc, er, ec, isVisited);
        // Move down
        count += CountMazePath(sr + 1, sc, er, ec, isVisited);

        // Backtrack by marking the current cell as unvisited
        isVisited[sr][sc] = false;

        return count;
    }

    public static void PrintAllMazePath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if (sr < 0 || sc < 0)
            return;
        if (sr > er || sc > ec)
            return;
        if (isVisited[sr][sc] == true)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        PrintAllMazePath(sr, sc + 1, er, ec, s + "R", isVisited);
        // go left
        PrintAllMazePath(sr, sc - 1, er, ec, s + "L", isVisited);
        // go Up
        PrintAllMazePath(sr - 1, sc, er, ec, s + "U", isVisited);
        // go Down
        PrintAllMazePath(sr + 1, sc, er, ec, s + "D", isVisited);
        isVisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        int count = CountMazePath(0, 0, rows - 1, cols - 1, isVisited);
        System.out.print("Number of paths are: " + count);
        System.out.println();
        PrintAllMazePath(0, 0, rows - 1, cols - 1, "", isVisited);
    }
}
