package Priority_Queues.Questions;

import java.util.PriorityQueue;
import java.util.Comparator;

/* K Closest Points to Origin (Leetcode 973) 
 * 
 * You are given a set of points in XY Plane, You need to find the k closest points to the origin using Manhattan distance.
 * It is guaranteed that no 2 points will have the same distance from the origin.
 * 
 * Input: n = 6, k = 3, points = {{5,3},{1,2},{3,4},{5,6},{7,8},{9,10}}
 * Output: {{1,2},{3,4},{5,3}}
 * 
 * Manhattan Distance => |x1 - x2| + |y1 - y2|
*/

class Point {
    int x, y, distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = Math.abs(x - 0) + Math.abs(y - 0); // Manhattan distance from origin (0,0)
    }
}

public class KClosestPointsToOrigin {
    public static class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            return Integer.compare(p1.distance, p2.distance); // Min Heap (Closest points first)
        }
    }

    public static Point[] findKClosest(int[][] points, int k) {
        PriorityQueue<Point> minHeap = new PriorityQueue<>(new PointComparator());

        // Insert points into min heap
        for (int[] p : points) {
            minHeap.add(new Point(p[0], p[1]));
        }

        // Extract k closest points
        Point[] result = new Point[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] points = { { 5, 3 }, { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
        int k = 3;

        Point[] closestPoints = findKClosest(points, k);

        System.out.println(k + " closest points to origin:");
        for (Point p : closestPoints) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }
}
