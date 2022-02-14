package leetcode.maximumsubarray;

class Solution {
  public int maxSubArray(int[] nums) {

    int[] memo = new int[nums.length];
    memo[0] = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      memo[i] = nums[i] + (Math.max(memo[i - 1], 0));
      max = Math.max(memo[i], max);
    }

    return max;
  }

}
