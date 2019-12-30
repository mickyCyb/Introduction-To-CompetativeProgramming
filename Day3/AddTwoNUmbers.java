package com.company;

public class AddTwoNUmbers {
    public static void main(String[] args){
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

  }

    class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode listNode = new ListNode(0);
            ListNode l3 = listNode;
            int carry = 0;
            int sum = 0;

            while(l1 != null || l2 != null){

                // checking if the elements are empty, if they are empty using 0
                int l1_value = (l1 != null)? l1.val:0;
                int l2_value = (l2 != null)? l2.val:0;

                sum = l1_value + l2_value + carry;
                carry = sum/10;  // ex. 9+9 = 18, 18/10=1
                int rem = sum%10;

                ListNode newNode = new ListNode(rem);
                l3.next =newNode;

                if(l1 != null){
                    l1 = l1.next;
                }

                if(l2 != null){
                    l2 = l2.next;
                }
                l3 = l3.next;


            }

            if(carry > 0){
                ListNode LN = new ListNode(carry);
                l3.next = LN;
                l3 = l3.next;
            }
            return listNode.next;
        }


    }



}
