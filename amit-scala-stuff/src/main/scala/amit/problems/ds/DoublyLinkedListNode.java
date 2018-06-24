package amit.problems.ds;

public class DoublyLinkedListNode<T> {
    protected DoublyLinkedListNode prev, next;
    protected T data;

    public DoublyLinkedListNode(T data, DoublyLinkedListNode prev, DoublyLinkedListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public String toString() {
        return "Data: " + this.data;
    }
}
