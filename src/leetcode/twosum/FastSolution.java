package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

class FastSolution {
  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      int left = target - nums[index];
      if (map.containsKey(left)) {
        return new int[] {map.get(left), index};
      }

      map.put(nums[index], index);
    }

    return new int[2];
  }
}
