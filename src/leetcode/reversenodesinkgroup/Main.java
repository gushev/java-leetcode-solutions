package leetcode.reversenodesinkgroup;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ListNode listNode = new ListNode(
        1,
        new ListNode(
            2,
            new ListNode(
                3,
                new ListNode(
                    4,
                    new ListNode(5))))
    );

    Solution solution = new Solution();
    System.out.println(solution.reverseKGroup(listNode, 2));
  }
}
