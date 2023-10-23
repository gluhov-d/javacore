package com.gluhov.javacore.chapter18;
/* Простая база данных телефонных номеров,
 построенная на основе списков свойств. */

import java.io.*;
import java.util.*;

class Phonebook {
    public static void main(String args[]) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        // Попыта�ъся о·гкрыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException е) {
            //игнорировать отсутствующий файл
        }
        /*Если телефонная книга уже существует, загрузить
         существующие телефонные номера. */
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Oшибкa чтения файла.");
        }
        // разрешить поль зователю вводить новые имена и
        // номера телефонов абонентов
        do {
            System.out.println("Bвeдитe имя" +
                    " ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Bвeдитe номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("выход"));
        // сохранить телефонную книгу, если она изменилась
        if (changed) {
            FileOutputStream fout =
                    new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }
        // искать номер по имени абонента
        do {
            System.out.println("Bвeдитe имя для поиска" +
                    " ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
