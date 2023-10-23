package com.gluhov.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]) {
        // создать хеш -множество
        HashSet<String> hs = new HashSet<String>();
        // ввести элементы в хеш -множество hs.add("Бета");
        hs.add("Aльфa");
        hs.add("Этa");
        hs.add("Гaммa");
        hs.add("Эпсилон");
        hs.add("OМeгa");
        System.out.println(hs);
    }
}
