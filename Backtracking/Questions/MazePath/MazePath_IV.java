package Backtracking.Questions.MazePath;

/* 
 * Rat in a maze-4 [4-directions (Go Left/Go Right and Go Up/Go Down)]
 *
 * A maze is an n*n binary matrix of blocks where the upper left block is known as the source block, & the lower
 * rightmost block is known as the destination block. If we considered the maze, then maze[0][0] is the source,
 * and the maze[n-1][n-1] is the destination. Our main task is to reach the destination from the source. We have
 * considered a rat as a character that can move either Forward or Downwards and Backward or Upward.
 * 
 * In the maze matrix, few dead blocks will be denoted by 0 and active blocks will be denoted by 1. 
 * A rat can move only in the active blocks.
  *  ___ ___ ___ ___ ___ ___ 
 * |_s_| 1 | 1 |_0_| 1 | 1 |
 * | 1 | 1 |_0_| 1 | 1 |_0_|
 * | 1 | 1 | 1 | 1 | 1 |_0_|
 * |_0_|_0_| 1 |_0_| 1 |_D_|
 */

public class MazePath_IV {
    // Count all possible paths from source to destination
    public static int CountMazePath(int sr, int sc, int er, int ec, int[][] maze, boolean[][] isVisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec) {
            return 0;
        }
        if (maze[sr][sc] == 0 || isVisited[sr][sc]) {
            return 0;
        }
        if (sr == er && sc == ec) {
            return 1; // One valid path found
        }

        isVisited[sr][sc] = true;

        // Explore all four directions and sum up the paths
        int totalPaths = 0;
        totalPaths += CountMazePath(sr, sc + 1, er, ec, maze, isVisited); // Right
        totalPaths += CountMazePath(sr, sc - 1, er, ec, maze, isVisited); // Left
        totalPaths += CountMazePath(sr - 1, sc, er, ec, maze, isVisited); // Up
        totalPaths += CountMazePath(sr + 1, sc, er, ec, maze, isVisited); // Down

        isVisited[sr][sc] = false; // Backtrack

        return totalPaths;
    }

    // Print all paths from source to destination
    public static void PrintAllMazePath(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] isVisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec) {
            return;
        }
        if (maze[sr][sc] == 0 || isVisited[sr][sc]) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;

        // Explore all four directions
        PrintAllMazePath(sr, sc + 1, er, ec, s + "R", maze, isVisited); // Right
        PrintAllMazePath(sr, sc - 1, er, ec, s + "L", maze, isVisited); // Left
        PrintAllMazePath(sr - 1, sc, er, ec, s + "U", maze, isVisited); // Up
        PrintAllMazePath(sr + 1, sc, er, ec, s + "D", maze, isVisited); // Down

        isVisited[sr][sc] = false; // Backtrack
    }

    public static void main(String[] args) {
        // Dimensions of the maze
        int rows = 3;
        int cols = 4;

        // Maze definition: 1 = open path, 0 = blocked path
        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }
        };

        // Initialize the visited array
        boolean[][] isVisited = new boolean[rows][cols];

        // Count all paths from (0, 0) to (rows-1, cols-1)
        int totalPaths = CountMazePath(0, 0, rows - 1, cols - 1, maze, isVisited);
        System.out.println("Number of paths are: " + totalPaths);

        // Print all paths from (0, 0) to (rows-1, cols-1)
        PrintAllMazePath(0, 0, rows - 1, cols - 1, "", maze, isVisited);
    }
}
