package com.program.linked_list;

/*
Given a linked list. Print all the elements of the linked list separated by space followed.

Examples:

Input: LinkedList : 1 -> 2

Output: 1 2
Explanation: The linked list contains two elements 1 and 2.The elements are printed in a single line.
 */
public class PrintLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        display(head);
    }
    static void display(Node head) {
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }
}
