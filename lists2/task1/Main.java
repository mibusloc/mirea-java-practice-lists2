package ru.mirea.lists2.task1;

public class Main {
    public static void main(String[] args) {
        // Вариант 2
        List list = new List();

        list.append(3);
        list.append(7);
        list.append(2);
        list.append(4);
        list.append(1);
        list.append(2);
        list.append(8);
        list.append(9);
        list.append(0);
        list.append(6);
        list.append(2);
        list.append(7);

        System.out.println("Исходный список:");
        list.display();

        list.sort();

        System.out.println("Отсортированный список:");
        list.display();
    }
}

