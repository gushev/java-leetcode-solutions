package other.maxconsecutivenumbers;

class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int maxConsecutive = 0;
    int currentCount = 0;

    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 0) {
        currentCount = 0;
      } else {
        currentCount++;
        maxConsecutive = currentCount > maxConsecutive ? currentCount : maxConsecutive;
      }
    }

    return maxConsecutive;
  }
}
