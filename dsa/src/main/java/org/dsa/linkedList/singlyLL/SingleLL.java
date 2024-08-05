package org.dsa.linkedList.singlyLL;


public class SingleLL {
    ListNode head;

    public SingleLL() {}

    public void insertAtEnd(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            return;
        }

        ListNode currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = node;

    }

    public void insertAtBeginning(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;

    }

    public void traversal() {
        ListNode currentNode = head;
        String traversal = " ";

        while (currentNode != null) {
            traversal += currentNode.val + " -> ";
            currentNode = currentNode.next;
        }

        System.out.println(traversal);
    }

    public boolean search(int target) {
        ListNode current = head;
        while (current != null) {
            if (current.val == target) {
                System.out.println("Found");
                return true;
            }

            current = current.next;
        }

        System.out.println("Not found");
        return false;
    }

    public int findLength() {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length ++;

            current = current.next;
        }

        System.out.println("length is " +length);
        return length;
    }

    public void insertAtPosition(int pos, int val) {
        int size = findLength();

        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position !");
        } else {
            ListNode node = new ListNode(val);
            ListNode temp = head;
            if (pos == 1) {
                node.next = head;
                head = node;
            } else {
                while (--pos > 1) {
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;
            }
        }
    }

    public void removeAtBeginning() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void removeAtEnd() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            return;
        }

        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void removeAtPos(int pos) {
        int size = findLength();

        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position");
        } else {
            ListNode current = head;

            if (pos == 1) {
                head = current.next;
            } else {
                while (--pos > 0) {
                    current = current.next;
                }

                current.next = current.next.next;
            }
        }
    }


    public static void main(String[] args) {
        SingleLL singleLL = new SingleLL();
        singleLL.insertAtEnd(1);
        singleLL.insertAtEnd(2);
        singleLL.insertAtEnd(3);
        singleLL.insertAtBeginning(4);
        singleLL.insertAtPosition(2,6);
        singleLL.traversal();
        singleLL.search(3);
        singleLL.search(5);
        singleLL.removeAtBeginning();
        singleLL.removeAtEnd();
        singleLL.removeAtPos(2);
        singleLL.traversal();
        singleLL.findLength();
    }

}
