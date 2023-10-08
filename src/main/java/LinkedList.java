public class MyLinkedList {
    private Node head; // Посилання на головний (перший) елемент списку
    private Node tail; // Посилання на останній елемент списку
    private int size;  // Кількість елементів у списку

    // Внутрішній клас для представлення вузла списку
    private class Node {
        Object data;
        Node next;
        Node prev;

        Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Додає елемент в кінець списку
    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Видаляє елемент за індексом
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        size--;
    }

    // Очищає список
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Повертає розмір списку
    public int size() {
        return size;
    }

    // Повертає елемент за індексом
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }
}
