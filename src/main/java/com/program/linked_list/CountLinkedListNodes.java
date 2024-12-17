package com.program.linked_list;

/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

Examples :

Input: LinkedList : 1->2->3->4->5

Output: 5
Explanation: Count of nodes in the linked list is 5, which is its length.
 */

public class CountLinkedListNodes {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Node count: "+ getCount(head));
    }

    public static int getCount(Node head){
        int count = 0;
        Node current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
}
