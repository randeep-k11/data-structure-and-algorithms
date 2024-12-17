package com.program.linked_list;

/*
Given the head of a singly linked list, the task is to check if the linked list has a loop. A loop means that the last node of the linked list is connected back to a node in the same list.  So if the next of the last node is null. then there is no loop.

Note: You need to return a boolean value true if there is a loop, otherwise false.

The following is an internal representation of every test case (three inputs).
A LinkedList and a pos (1-based index)-Position of the node to which the last node links back if there is a loop. If the linked list does not have any loop, then pos = 0.

Examples:

Input: LinkedList: 1->3->4
Output: true
Explanation:

See the above list there exists a loop connecting the last node back to the second node.
 */
public class DetectLoopInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =  head;

        System.out.println(detectLoop(head));

    }

    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        if(head == null || head.next == null)
            return false;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }

        return false;

    }
}
