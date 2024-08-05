package org.dsa.linkedList;

import org.dsa.linkedList.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted linked list and return the head of the new sorted linked list.
 * The new list should be made up of nodes from list1 and list2.
 * Input: list1 = [1,2,4], list2 = [1,3,5]
 * Output: [1,1,2,3,4,5]
 * **/

public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        traversal(mergeTwoLists(node1,listNode1));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null) {
            System.out.println("List1 value" +list1.val);
            System.out.println("List2 value" +list2.val);
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }

            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }

        return dummy.next;
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
