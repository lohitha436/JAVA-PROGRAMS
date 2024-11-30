class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Method to delete a node with a given value
    public void delete(int data) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next; // if head is to be deleted
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                return; // Element found and deleted
            }
            temp = temp.next;
        }
        System.out.println("Element " + data + " not found in the list.");
    }

    // Method to display the contents of the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MainN {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Inserting elements into the doubly linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original list:");
        list.display();

        // Deleting an element
        int elementToDelete = 30;
        System.out.println("Deleting element: " + elementToDelete);
        list.delete(elementToDelete);

        // Displaying the list after deletion
        System.out.println("List after deletion:");
        list.display();
    }
}
