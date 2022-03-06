package leetcode.reversenodesinkgroup;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int length = 0;
        List<ListNode> originalOrder = new ArrayList();
        List<ListNode> list = new ArrayList();
        while(node.next != null) {
            length++;
            list.add(node);
            originalOrder.add(node);
            node = node.next;
        }

        for (int i = length / k; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        ListNode newHead = list.get(0);
        node = newHead;

        for (int i = 1; i < list.size(); i++) {
            node.next = list.get(i);
            node = node.next;
        }

        return newHead;
    }
}