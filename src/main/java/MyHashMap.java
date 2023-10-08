class MyHashMap {
    private static final int TABLE_SIZE = 16; // Розмір хеш-таблиці
    private Node[] table = new Node[TABLE_SIZE];

    // Внутрішній клас Node для зберігання ключа та значення
    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    // Хеш-функція для обчислення індексу в таблиці
    private int hash(Object key) {
        return key.hashCode() % TABLE_SIZE;
    }

    // Додати пару ключ + значення
    public void put(Object key, Object value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Оновити значення, якщо ключ вже існує
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value; // Оновити значення, якщо ключ вже існує
            } else {
                current.next = newNode;
            }
        }
    }

    // Видалити пару за ключем
    public void remove(Object key) {
        int index = hash(key);

        if (table[index] == null) {
            return;
        }

        if (table[index].key.equals(key)) {
            table[index] = table[index].next;
            return;
        }

        Node current = table[index];
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Очистити таблицю
    public void clear() {
        table = new Node[TABLE_SIZE];
    }

    // Отримати розмір таблиці
    public int size() {
        int count = 0;
        for (Node node : table) {
            Node current = node;
            while (current != null) {
                count++;
                current = current.next;
            }
        }
        return count;
    }

    // Отримати значення за ключем
    public Object get(Object key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // Ключ не знайдено
    }
}
