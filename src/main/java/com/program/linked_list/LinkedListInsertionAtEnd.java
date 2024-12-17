package com.program.linked_list;

/*
Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.

Examples :

Input: LinkedList: 1->2->3->4->5 , x = 6
Output: 1->2->3->4->5->6
Explanation:

We can see that 6 is inserted at the end of the linkedlist.
 */

import static com.program.linked_list.PrintLinkedList.display;

public class LinkedListInsertionAtEnd {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = insertAtEnd(head, 6);
        display(result);
    }

    public static Node insertAtEnd(Node head, int x){
        if(head == null){
            return new Node(x);
        }
        Node temp = head;
        while (temp.next !=null){
            temp = temp.next;
        }
        Node node = new Node(x);
        temp.next = node;
        return head;
    }
}
