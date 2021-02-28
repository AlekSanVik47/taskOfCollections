package com.company;

import java.util.*;

public class Phonebook {
    List<String> contacts = new ArrayList<>();
    List<String> number = new ArrayList <>();
    Map<List<String>, List<String>> phoneBook;

    public void add(String[] contact){
        String[] surname = new String[8];
        for (String lastName: surname) {
            List<String> contacts = new ArrayList<>();
            contacts.add(lastName);
        }

    }
    public void get(){
        Map <String, String> phoneBook = new HashMap <>();
        for (String surname: phoneBook.values()) {
            for (String phones: phoneBook.keySet()) {
                Set<String> phone = phoneBook.keySet();
                System.out.println(phoneBook.keySet() + ": " + phone);
            }
        }
        
    }



    public static void main(String[] args) {
        List<String> contacts = new ArrayList<>();
        List<String> number = new ArrayList <>();
        Map <String, String> phoneBook = new HashMap <>();
        String[] surname = {"Petrov", "Ivanov", "Popov", "Petrov", "Semenov", "Shestakov", "Leonov", "Semenov"};
        String[] phone = {"456 789", "270 270", "154 123", "788 695", "785 695", "327 456", "270 270", "147 233"};

        Phonebook phonebook = new Phonebook();
        phonebook.add(surname);
        phonebook.add(phone);
        for (int i = 0; i < surname.length; i++) {
            for (int j = 0; j < phone.length; j++) {
                if (i == j)
                phoneBook.putIfAbsent(phone[i], surname[j]);
            }
        }
        for (Map.Entry <String, String> o: phoneBook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        phonebook.get();

    }

}
