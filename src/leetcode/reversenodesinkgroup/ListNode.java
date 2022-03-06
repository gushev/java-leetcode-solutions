package leetcode.reversenodesinkgroup;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        String result = String.valueOf(val);

        if (next != null) {
            result += "," + next.toString();
        }

        return result;
    }
}
