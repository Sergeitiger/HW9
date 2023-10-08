import java.util.LinkedList;

class MyStack {
    private LinkedList<Object> stack = new LinkedList<>();

    // Додати елемент в кінець стеку
    public void push(Object value) {
        stack.addLast(value);
    }

    // Видалити елемент за індексом
    public void remove(int index) {
        if (index >= 0 && index < stack.size()) {
            stack.remove(index);
        }
    }

    // Очистити стек
    public void clear() {
        stack.clear();
    }

    // Отримати розмір стеку
    public int size() {
        return stack.size();
    }

    // Отримати перший елемент стеку (без видалення)
    public Object peek() {
        if (isEmpty()) {
            return null; // Можна обробити помилку, якщо необхідно
        }
        return stack.getLast();
    }

    // Отримати та видалити перший елемент стеку
    public Object pop() {
        if (isEmpty()) {
            return null; // Можна обробити помилку, якщо необхідно
        }
        return stack.removeLast();
    }

    // Перевірити, чи стек пустий
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

