/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if there is no intersection
        if (headA == null || headB == null)
            return null;

        //traverse the smaller list in example 1
        ListNode pointer_A = headA;
         //traverse the bigger list in example 1
        ListNode pointer_B = headB;

        while (pointer_A != pointer_B)
        {
            //A
            //if true, the end of the list has been reached
            if(pointer_A == null)
            {
                pointer_A = headB;
            }
            else
                pointer_A = pointer_A.next;

            //B
            //if true, the end of the list has been reached
            if(pointer_B == null)
            {
                pointer_B = headA;
            }
            else
                pointer_B = pointer_B.next;

            //in the second loop, the nodes a and b will catch up to each other due to the difference
            //The while loop continously loops until node A and B meet
        }
        return pointer_A; //can return pointer_B as well due to both 
                      //of them hit null at the end since they both meet 
    }
} 
