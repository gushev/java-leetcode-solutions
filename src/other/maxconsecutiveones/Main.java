package other.maxconsecutiveones;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 */

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
  }
}
