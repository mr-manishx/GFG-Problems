
import java.io.*;

class LinkedList{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data){

        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list){

        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static LinkedList deleteByKey(LinkedList list,  int key){

        // Store head node
        Node currNode = list.head;
        Node prev = null;

        // CASE 1:
        // If head node itself holds the key to be deleted
        if(currNode != null && currNode.data == key){
            list.head = currNode.next;   // Changed
            // Display the message
            System.out.println(key+" found and deleted");
            // Return the updated List
            return list;
        }

        // CASE 2:
        // If the key is somewhere other than at head
        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while(currNode != null && currNode.data != key){

            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if(currNode != null){

            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;
            // Display the message
            System.out.println(key+" found and deleted");
        }

        // CASE 3: The key is not present
        // If key was not present in linked list
        // currNode should be null
        if(currNode == null){

            // Display the message
            System.out.println(key+" not found");
        }
        // return the List
        return list;
    }

    // **************DELETION AT A POSITION**************

    public static LinkedList deleteAtAnyPosition(LinkedList list, int index){

        Node currNode = list.head;
        Node prev = null;

        if(currNode != null && index == 0){

            list.head = currNode.next;
            System.out.println(index+" position element deleted");
            return list;
        }

        int counter = 0;
        while(currNode != null){
            if(index == counter){

                prev.next = currNode.next;
                System.out.println(index+" position element deleted");
                return list;
            }
            else{
                prev = currNode;
                currNode = currNode.next;
                counter ++;
            }
        }
        if(currNode == null){
            System.out.println(index+" position element not found");
        }
        return list;
    }
}

class TestLinkedList{

    public static void main(String[] args){

        // Start with the empty list
        LinkedList list = new LinkedList();

        // Insert the values
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 5);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 9);

        // Print the LinkedList
        LinkedList.printList(list);

        // -----Deletion By Key------

        // Delete node with value 1
        // In this case the key is ***at head***

//        LinkedList.deleteByKey(list, 1);
//
//        // print updated list
//        LinkedList.printList(list);

        // --- deletion element at any position-----
        LinkedList.deleteAtAnyPosition(list, 2);

        LinkedList.printList(list);

    }
}