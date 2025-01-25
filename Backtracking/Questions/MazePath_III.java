package Backtracking.Questions;

/* 
 * Rat in a maze-3 [2-directions (Go Right/Go Down)]
 *
 * A maze is an n*n binary matrix of blocks where the upper left block is known as the source block, & the lower
 * rightmost block is known as the destination block. If we considered the maze, then maze[0][0] is the source,
 * and the maze[n-1][n-1] is the destination. Our main task is to reach the destination from the source. We have
 * considered a rat as a character that can move either Forward or Downwards.
 * 
 * In the maze matrix, few dead blocks will be denoted by 0 and active blocks will be denoted by 1. 
 * A rat can move only in the active blocks.
 *  ___ ___ ___ ___ ___ ___ 
 * |_s_| 1 | 1 |_0_| 1 | 1 |
 * | 1 | 1 |_0_| 1 | 1 |_0_|
 * | 1 | 1 | 1 | 1 | 1 |_0_|
 * |_0_|_0_| 1 |_0_| 1 |_D_|
 */
public class MazePath_III {

    // Count the number of valid paths
    public static int CountMazePath(int sr, int sc, int er, int ec, int[][] maze) {
        if (sr > er || sc > ec || sr < 0 || sc < 0 || maze[sr][sc] == 0)
            return 0;
        if (sr == er && sc == ec)
            return 1;
        int downWays = CountMazePath(sr + 1, sc, er, ec, maze);
        int rightWays = CountMazePath(sr, sc + 1, er, ec, maze);
        return downWays + rightWays;
    }

    // Print all valid paths
    public static void PrintAllMazePath(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr > er || sc > ec || sr < 0 || sc < 0 || maze[sr][sc] == 0)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        // Move down
        PrintAllMazePath(sr + 1, sc, er, ec, s + "D", maze);
        // Move right
        PrintAllMazePath(sr, sc + 1, er, ec, s + "R", maze);
    }

    public static void main(String[] args) {
        // Define the maze
        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }
        };

        int rows = maze.length;
        int cols = maze[0].length;

        // Count and print the number of valid paths
        int count = CountMazePath(0, 0, rows - 1, cols - 1, maze);
        System.out.println("Number of paths are: " + count);

        // Print all the paths
        PrintAllMazePath(0, 0, rows - 1, cols - 1, "", maze);
    }
}
