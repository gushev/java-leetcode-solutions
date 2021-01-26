package leetcode.mergetwosortedlists;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(5)));

        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(l1, l2));
    }
}
