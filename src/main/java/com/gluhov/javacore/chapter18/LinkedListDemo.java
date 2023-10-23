package com.gluhov.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        // создать связный список
        LinkedList<String> ll = new LinkedList<String>();
        // ввести элементы в связный список 11.add("F") ;
        ll.add("B");
        ll.add("D");
        ll.add("Е");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "А2");
        System.out.println(
                "Исходное содержимое связного списка 11 : " + ll);
        // удалить элементы из связного списка 11 .remove {
        ll.remove("F");
        ll.remove(2);
        System.out.println(
                "Содержимое связного списка ll " +
                        "после удаления элементов : " + ll);
        //удалить первый и последний элементы из связного списка
        ll.removeFirst();
        ll.removeLast();
        System.out.println(
                "Содержимое связного списка 11 после удаления " + "первого и последнего элементов : " + ll);
        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println(
                "Содержимое связного списка 11 после изменения : " + ll);
    }
}
