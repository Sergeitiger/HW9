import java.util.LinkedList;

class MyQueue {
    private LinkedList<Object> queue = new LinkedList<>();

    // Додати елемент в кінець черги
    public void add(Object value) {
        queue.addLast(value);
    }

    // Очистити чергу
    public void clear() {
        queue.clear();
    }

    // Отримати розмір черги
    public int size() {
        return queue.size();
    }

    // Отримати перший елемент черги (без видалення)
    public Object peek() {
        if (isEmpty()) {
            return null; // Можна обробити помилку, якщо необхідно
        }
        return queue.getFirst();
    }

    // Отримати та видалити перший елемент черги
    public Object poll() {
        if (isEmpty()) {
            return null; // Можна обробити помилку, якщо необхідно
        }
        return queue.removeFirst();
    }

    // Перевірити, чи черга пуста
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
