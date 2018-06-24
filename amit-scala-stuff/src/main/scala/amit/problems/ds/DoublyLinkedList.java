package amit.problems.ds;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Amit on 17-01-2015.
 */
public class DoublyLinkedList<T> {

    protected DoublyLinkedListNode<T> head;
    protected DoublyLinkedListNode<T> tail;

    protected AtomicInteger size = new AtomicInteger(0);

    public void addNodeAtTail(DoublyLinkedListNode<T> node) {
        if(head == null){
            head = node;
        } else {
            insertNodeBetween(tail, null, node);
        }
        tail = node;
        size.incrementAndGet();
    }

    public void removeNode(DoublyLinkedListNode<T> node) {
        size.decrementAndGet();
    }

    private void insertNodeBetween(DoublyLinkedListNode<T> prev,
                                   DoublyLinkedListNode<T> next,
                                   DoublyLinkedListNode<T> curr) {
        if(prev != null) {
            prev.next = curr;
            curr.prev = prev;
        }
        if(next != null) {
            next.prev = curr;
            curr.next = next;
        }
    }

    private void deleteNode(DoublyLinkedListNode<T> curr) {
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }
        if(curr.next != null) {
            curr.next.prev = curr.prev;
        }
    }

}
