package leetcode.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public boolean isValid(String s) {
    Deque<Character> deque = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);

      if (isBeginning(currentChar)) {
        deque.addLast(currentChar);
      } else if (deque.size() > 0 && removes(currentChar) == deque.getLast()) {
        deque.removeLast();
      } else {
        return false;
      }
    }

    return deque.isEmpty();
  }

  private boolean isBeginning(char c) {
    return "{[(".indexOf(c) != -1;
  }

  private char removes(char c) {
    return switch (c) {
      case '}' -> '{';
      case ']' -> '[';
      case ')' -> '(';
      default -> '_';
    };
  }
}
