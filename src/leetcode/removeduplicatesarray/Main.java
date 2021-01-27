package leetcode.removeduplicatesarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(input));
        System.out.println(Arrays.toString(input));
    }
}
