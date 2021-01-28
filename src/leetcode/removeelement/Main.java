package leetcode.removeelement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {0,1,2,2,3,0,4,2};
        System.out.println(solution.removeElement(input, 2));
        System.out.println(Arrays.toString(input));
    }
}
