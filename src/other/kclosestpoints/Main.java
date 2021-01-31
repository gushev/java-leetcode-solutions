package other.kclosestpoints;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[][] points = new Integer[][]{
                {-2, 4}, {0, -2}, {-1, 0},
                {3, 5}, {-2, -3}, {3, 2}
        };
        int numResults = 3;

        findKClosestPoints(points, numResults);
    }

    private static void findKClosestPoints(Integer[][] points, int numResults) {
        PriorityQueue<Integer[]> maxHeap = new PriorityQueue<>((a, b) ->  calculateDistance(b) - calculateDistance(a));

        for(int i = 0; i < points.length; i++) {
            int distance = calculateDistance(points[i]);

            if(maxHeap.size() < numResults) {
                maxHeap.add(points[i]);
                continue;
            }

            if(distance <= calculateDistance(maxHeap.peek())) {
                maxHeap.remove();
                maxHeap.add(points[i]);
            }
        }

        for (Integer[] point : maxHeap) {
            System.out.println("Point: " + point[0] + " " + point[1] + " with distance: " + calculateDistance(point));
        }
    }

    private static int calculateDistance(Integer[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
