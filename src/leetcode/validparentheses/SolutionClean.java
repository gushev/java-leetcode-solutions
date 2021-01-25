package leetcode.validparentheses;

import java.util.Stack;

public class SolutionClean {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      if(a == '(' || a == '[' || a == '{') stack.push(a);
      else if(stack.empty()) return false;
      else if(Math.abs(a - stack.pop()) > 2) return false;
    }
    return stack.empty();
  }
}
