/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        //compare one with two
        ListNode one = head;
        ListNode two = head.next;

        while(one != two)
        {
            //did two reach the enc without cycling back
            if (two == null || two.next == null)
            {
                return false;
            }

            one = one.next;
            two = two.next.next;
        }
        return true;
    }
}
