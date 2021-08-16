package leetcode.rangesumquery;

public class NumArraySimple implements NumArray {

  private final int[] nums;

  public NumArraySimple(int[] nums) {
    this.nums = nums;
  }

  public int sumRange(int left, int right) {
    int sum = 0;

    while (left <= right) {
      sum += nums[left];
      left++;
    }

    return sum;
  }
}