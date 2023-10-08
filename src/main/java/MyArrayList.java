public class MyArrayList {
    private Object[] data; // Масив для зберігання даних
    private int size;       // Поточний розмір колекції

    // Конструктор, що ініціалізує масив та розмір
    public MyArrayList() {
        data = new Object[10]; // Початковий розмір масиву
        size = 0;              // Початковий розмір колекції
    }

    // Метод для додавання елемента в кінець колекції
    public void add(Object value) {
        // Перевіряємо, чи потрібно збільшити розмір масиву
        if (size == data.length) {
            increaseCapacity();
        }
        data[size++] = value; // Додаємо елемент та збільшуємо розмір
    }

    // Метод для видалення елемента за індексом
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        // Переміщаємо елементи після видаляємого назад на одну позицію
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // Зменшуємо розмір колекції та останній елемент стає null
        data[--size] = null;
    }

    // Метод для очищення колекції
    public void clear() {
        // Змінюємо всі елементи на null і розмір на 0
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    // Метод для отримання розміру колекції
    public int size() {
        return size;
    }

    // Метод для отримання елемента за індексом
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return data[index];
    }

    // Внутрішній метод для збільшення розміру масиву
    private void increaseCapacity() {
        int newCapacity = data.length * 2; // Збільшуємо розмір удвічі
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}
