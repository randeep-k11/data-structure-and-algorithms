package com.program.linked_list;

/*
Given the head of a Singly Linked List and a value x. The task is to insert the key in the middle of the linked list.

Examples :

Input: LinkedList = 1->2->4 , x = 3
Output: 1->2->3->4
Explanation:

The new element is inserted after the current middle element in the linked list.

 */

import static com.program.linked_list.PrintLinkedList.display;

public class InsertInMiddleOfLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        display(head);
        System.out.println();
        head = insertInMiddle(head, 3);
        display(head);
    }

    public  static Node insertInMiddle(Node head, int x){
        if(head == null){
            return new Node(x);
        }
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = new Node(x);
        newNode.next = slow.next;
        slow.next = newNode;
        return head;
    }
}
