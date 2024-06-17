import java.util.Scanner;

// Define a Node class to represent each element of the linked list
class Node {
    int data;
    Node next;
    
    // Constructor to initialize a node with data only
    Node(int data) {
        this.data = data;
    }
    
    // Constructor to initialize a node with both data and a reference to the next node
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

// Define the LinkedListCreation class to manage linked list operations
public class LinkedListCreation {
    private Node head;

    // Constructor to initialize an empty linked list
    public LinkedListCreation() {
        this.head = null;
    }
    
    // Method to add a new element to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        // If the linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Otherwise, traverse the list to find the last node and append the new node
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    
    // Method to display the elements of the linked list
    public void display() {
        Node temp = head;
        // Traverse the linked list and print each element
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to interact with the user and demonstrate the linked list functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListCreation list = new LinkedListCreation();
        
        System.out.println("Enter elements to add to the linked list (enter -1 to stop):");
        int element;
        // Continuously read integers from the user until -1 is entered, adding each integer to the linked list
        while ((element = scanner.nextInt()) != -1) {
            list.add(element);
        }
        
        // Display the singly linked list
        System.out.println("Singly Linked List:");
        list.display();

        scanner.close();
    }
}
