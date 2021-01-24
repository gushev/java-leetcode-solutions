package leetcode.romantointeger;

class Solution {
  public int romanToInt(String s) {
    int result = 0;

    for(int i = 0; i < s.length(); i++) {
      char previousChar = s.charAt(i);
      char nextChar = 'a';
      if (i + 1 < s.length()) {
        nextChar = s.charAt(i + 1);
      }

      int currentNumber = getValue(s.charAt(i));

      if (previousChar == 'I' && (nextChar == 'V' || nextChar == 'X') ||
        previousChar == 'X' && (nextChar == 'L' || nextChar == 'C') ||
        previousChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
        currentNumber = -currentNumber;
      }

      result += currentNumber;
    }

    return result;
  }

  private int getValue(char c){
    return switch (c) {
      case 'I' -> 1;
      case 'V' -> 5;
      case 'X' -> 10;
      case 'L' -> 50;
      case 'C' -> 100;
      case 'D' -> 500;
      case 'M' -> 1000;
      default -> 0;
    };
  }
}
