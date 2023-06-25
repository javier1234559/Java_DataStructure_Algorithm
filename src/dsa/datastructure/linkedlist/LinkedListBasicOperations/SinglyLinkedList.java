package dsa.datastructure.linkedlist.LinkedListBasicOperations;

class SinglyLinkedList {
    Node head; // head of list

    /* Node Class */
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
}