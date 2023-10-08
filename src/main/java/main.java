public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Додавання елементів
        list.add("Hello");
        list.add("World");
        list.add("!");

        // Отримання розміру колекції
        int size = list.size();
        System.out.println("Розмір колекції: " + size);

        // Отримання елементу за індексом
        Object element = list.get(1);
        System.out.println("Елемент за індексом 1: " + element);

        // Видалення елементу за індексом
        list.remove(0);
        System.out.println("Після видалення елементу за індексом 0: " + list.get(0));

        // Очищення колекції
        list.clear();
        System.out.println("Розмір після очищення: " + list.size());
    }
}
