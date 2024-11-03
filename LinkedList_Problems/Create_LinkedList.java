
import java.io.*;

// implement a singly linked list
public class LinkedList{
    Node head;  // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node{
        int data;
        Node next;

        // constructor
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    // methods like insert, delete .. etc
}