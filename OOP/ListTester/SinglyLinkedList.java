public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Remove a node
    public void remove() {
        if (this.head.next == null){
            System.out.println("List had only one node.");
            this.head = null;
        } else {
            Node runner = this.head;
            while (runner.next.next != null){
                runner = runner.next;
            }
                System.out.println("This node was removed: " + runner.value);
                runner.next = null;
            }
    }

    // Print all values in list
    public void printValues(){
        if (this.head == null){
            System.out.println("This list is empty.");
        } else {
            Node runner = this.head;
            while (runner.next != null){
                System.out.println("List value: " + runner.value);
                runner = runner.next;
            }
        }
    }

}