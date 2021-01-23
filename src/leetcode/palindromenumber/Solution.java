package leetcode.palindromenumber;

class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int inputNumber = x;
    int reversedNumber = 0;

    while(x != 0) {
      int remainder = x % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      x /= 10;
    }

    return inputNumber == reversedNumber;
  }
}
