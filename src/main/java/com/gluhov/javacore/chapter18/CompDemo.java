package com.gluhov.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    /*
    public int compare(String а, String Ь) {
        String aStr, bStr;
        aStr = а;
        bStr = Ь;
        // выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
    */
    // переопределять метод equals() не требуется

    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr) ;
    }
}

public class CompDemo {
    public static void main(String[] args) {
        /*MyComp mc = new MyComp(); // создать компаратор
        // передать вариант компаратора типа MyComp с обратным
        // упорядочением древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());*/

        // создать древовидное множество типа TreeSet
        //TreeSet<String> ts = new TreeSet<String>(new MyComp());

        /*Comparator<String> mc = (aStr, bStr) -> aStr.compareTo(bStr);
        TreeSet<String> ts = new TreeSet<>(mc);*/

        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> aStr.compareTo(bStr));

        // ввести элементы в древовидное множество
        ts.add("C") ; ts.add("A") ; ts.add("B") ; ts.add("E") ; ts.add("F") ; ts.add("D") ;
        // вывести элементы из древовидного множества
        for(String element : ts)
            System.out.print(element + " ");
        System.out.println() ;
    }
}

