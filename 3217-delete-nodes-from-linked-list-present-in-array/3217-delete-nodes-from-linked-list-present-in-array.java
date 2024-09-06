import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> valueSet = new HashSet<>();
        for (int num : nums) {
            valueSet.add(num);
        }

        ListNode tempNode = new ListNode(0);
        ListNode resultNode = tempNode;

        while (head != null) {
            if (!valueSet.contains(head.val)) {
                tempNode.next = new ListNode(head.val);
                tempNode = tempNode.next;
            }
            head = head.next;
        }

        return resultNode.next;
    }
}
