package com.program.linked_list;

/*
Given the head of a linked list, the task is to reverse this list and return the reversed head.

Examples:

Input: Linked list: 1->2->3->4->5->6
Output: 6->5->4->3->2->1
Explanation:

 */

import static com.program.linked_list.PrintLinkedList.display;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node result = reversList(head);
        display(result);
    }

    public static Node reversList( Node head){

        Node curr = head;
        Node prev = null;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
      return prev;
    }
}
