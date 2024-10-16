// 2807. Insert Greatest Common Divisors in Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode nextNode = head.next;
        ListNode tempHead = head;
        while (nextNode != null) {
            ListNode newNode = new ListNode(gcd(tempHead.val, nextNode.val), nextNode);
            tempHead.next = newNode;
            tempHead = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }
}
