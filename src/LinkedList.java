public class LinkedList<T> {
    class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public Node current = null;

    public void addNode(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = head;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void prev() {
        if (current != head) {
            current = current.prev;
        }
    }

    public void next() {
        if (current != tail) {
            current = current.next;
        }
    }
}
