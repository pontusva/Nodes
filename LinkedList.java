public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;

        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public static void main(String[] args) {
        // creates Nodes
        Node firstNode = new Node("I am the first Node!"); 
        Node secondNode = new Node("I am the second Node!");
        firstNode.setNextNode(secondNode); // this line makes the first node point to the second node with help from setNextNode method.

        System.out.println(firstNode.next.data);

    }
}
