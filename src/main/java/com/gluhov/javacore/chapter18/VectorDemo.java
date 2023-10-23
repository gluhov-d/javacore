package com.gluhov.javacore.chapter18;

// Продемонстрировать различные операции с вектором

import java.util.*;

class VectorDemo {
    public static void main(String args[]) {
        // начальный размер вектора - 3 , а инкремент - 2
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("Haчaльный размер вектора: " + v.size());
        System.out.println("Haчaльнaя емкость вектора: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println(
                "Емкость вектора после ввода четырех элементов: " + v.capacity());
        v.addElement(5);
        System.out.println("Teкyщaя емкость вектора: " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Teкyщaя емкость вектора: " + v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("Teкyщaя емкость вектора: " + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println(
                "Первый элемент вектора: " + v.firstElement());
        System.out.println(
                "Последний элемент вектора: " + v.lastElement());
        if (v.contains(3))
            System.out.println("Beктop содержит З.");
        // перечислить элементы вектора
        /*Enumeration<Integer> vEnum = v.elements();
        System.out.println("\nЭлeмeнты вектора : ");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();*/

        // Использовать итератор для вывода содержимого вектора
        /*Iterator<Integer> vitr = v.iterator();
        System.out.println("\nЭлeмeнты вектора:");
        while (vitr.hasNext()) System.out.print(vitr.next() + " ");
        System.out.println();*/

        // Использовать усовершенствованный цикл for в стиле for each
        // для вывода элементов вектора
        System.out.println("\nЭлeмeнты вектора:") ;
        for(int i : v)
            System.out.print(i + " ");
        System.out.println() ;
    }
}
