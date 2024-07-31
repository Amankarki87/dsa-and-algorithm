package org.dsa.linkedList;


/**
 * Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.
 *
 * Example
 * Input: head = [0,1,2,3]
 * Output: [3,2,1,0]
 * */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        traversal(reverseList(node1));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        ListNode currentPrevious = null;

        while (current != null) {
            next = current.next;
            currentPrevious = previous;

            previous = current;
            previous.next = currentPrevious;
            current = next;
        }

        return previous;
    }

    public static void traversal(ListNode head) {
        ListNode currentNode = head;
        String traversal = " ";

        while (currentNode != null) {
            traversal += currentNode.val + " -> ";
            currentNode = currentNode.next;
        }

        System.out.println(traversal);
    }
}
