package com.program.linked_list;
/*
Given two linked lists head1 and head2, find the intersection of two linked lists. Each of the two linked lists contains distinct node values.

Note: The order of nodes in this list should be the same as the order in which those particular nodes appear in input head1 and return null if no common element is present.

Examples:

Input: LinkedList1: 9->6->4->2->3->8 , LinkedList2: 1->2->8->6

Output: 6->2->8
Explanation: Nodes 6, 2 and 8 are common in both of the lists and the order will be according to LinkedList1.
 */

import java.util.HashSet;

import static com.program.linked_list.PrintLinkedList.display;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.next = new Node(6);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(3);
        head1.next.next.next.next.next = new Node(8);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(6);

        Node result = getIntersectionNode(head1, head2);
        display(result);

    }

    public  static Node getIntersectionNode(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        HashSet<Integer> set = new HashSet<>();

        while(temp1 !=null){
            set.add(temp1.data);
            temp1 = temp1.next;
        }

        Node newNode = null;
        Node lastNode = null;

        while(temp2 !=null){
            if(set.contains(temp2.data)){
                if(newNode == null){
                    newNode = new Node(temp2.data);
                    lastNode = newNode;
                } else {
                    Node node = new Node(temp2.data);
                    lastNode.next = node;
                    lastNode = lastNode.next;
                }
            }
            temp2 = temp2.next;
        }

        return newNode;
    }
}
