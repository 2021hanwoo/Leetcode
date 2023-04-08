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
class Solution 
{
    // The solution presented here consists an error, because ListNode class is not defined.
    // ListNode class is defined as shown above
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode l3 = new ListNode();   //defining a return variable
        ListNode head = l3;             //saving the pointer to the return variable
        int carryval = 0;               //initializing an integer to be used for calculation

        while (l1 != null || l2 != null) 
        {
            int l1Val = l1 != null ? l1.val : 0;    //fetching a value from list 1, set it as 0 if null.
            int l2Val = l2 != null ? l2.val : 0;    //fetching a value from list 2, set it as 0 if null.
            int sum = l1Val + l2Val + carryval;
            carryval = sum >= 10 ? 1 : 0;           //adjusting the carryval for next cycle
            sum = sum % 10;
            l3.next = new ListNode(sum);            //instantiating a new node to the linked list
            l3 = l3.next;                           //adjusting the pointer of the return linkedlist
            l1 = l1 != null ? l1.next : null;       //adjusting the pointers of the input linkedlists
            l2 = l2 != null ? l2.next: null;
        }
        
        if (carryval != 0) 
        {
            l3.next = new ListNode(carryval);       //adding an extra digit to the linkedlist if there is one
        }
        return head.next;                           //returning the head node of the return linkedlist
    }
}