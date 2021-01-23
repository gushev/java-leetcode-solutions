package leetcode.twosum;

class LessMemorySolution {
  public int[] twoSum(int[] nums, int target) {
    for (int outer = 0; outer < nums.length; outer++) {
      for (int inner = 0; inner < nums.length; inner++) {
        if (outer == inner) continue;

        if (nums[outer] + nums[inner] == target) {
          int[] result = {outer, inner};
          return result;
        }
      }
    }

    return new int[2];
  }
}
