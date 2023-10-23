package com.gluhov.javacore.chapter18;
// Использовать метод thenComparinq() для сортировки
//счетов вкладчиков сначала по фамилии, а затем по имени

import java.util.*;

//Компаратор,сравнивающий фамилии вкладчиков
class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        // найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// отсортировать счета вкладчиков по Ф.И.О. , если фамилии одинаковы
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        // использовать метод thenCoшparing() для создания
        // компаратора, сравнивающего сначала фамилии, а затем
        // Ф.И.О. вкладчиков, если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());
        // создать древовидное отображение
        TreeMap<String, Double> tm =
                new TreeMap<String, Double>(compLastThenFirst);
        // ввести элементы в древовидное отображение
        tm.put("Джoн Доу", 3434.34);
        tm.put("Toм Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Toд Халл", 99.22);
        tm.put("Paльф Смит", -19.08);
        // получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        // вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джoн Доу");
        tm.put("Джoн Доу", balance + 1000);
        System.out.println("Hoвый остаток на счете Джон Доу: " +
                tm.get("Джoн Доу"));
    }
}