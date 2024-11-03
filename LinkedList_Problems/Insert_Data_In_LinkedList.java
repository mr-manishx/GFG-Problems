
import java.io.*;

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {

        // create a new node with given data
        Node new_node = new Node(data);

        // if the linked list is empty
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // insert the new_node at last node
            last.next = new_node;
        }
        /// return the list by head
        return list;
    }

    // method to print linkedlist
    public static void printList(LinkedList list) {

        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // traverse through the linkedlist
        while (currNode != null) {

            // print the data at current node
            System.out.print(currNode.data + " -> ");

            // go to the next node
            currNode = currNode.next;
        }
    }
}

class UseLinkedList{

    public static void main(String[] args){

        // start with the empty list
        LinkedList list = new LinkedList();

        // insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);

        // print the linkedlist

        LinkedList.printList(list);

    }
}