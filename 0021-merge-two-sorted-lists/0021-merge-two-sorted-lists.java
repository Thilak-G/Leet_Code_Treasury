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
    ArrayList<Integer> arr = new ArrayList<>();
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1 != null){
            arr.add(list1.val);
            list1 = list1.next ;
        }
        while(list2 != null){
            arr.add(list2.val);
            list2 = list2.next ;
        }
        Collections.sort(arr);
        ListNode head = null ;
        ListNode tail = null ;
        for(int i = 0 ; i < arr.size() ; i++){
            ListNode nn = new ListNode(arr.get(i));
            if(head == null){
                head = nn ;
                tail = nn ;
            }
            else{
                tail.next = nn ;
                tail = nn ;
            }
        }
        return head;
    }
}