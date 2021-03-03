package com.company;

import java.util.*;

public class Phonebook implements Directory {
    private Map <String[], Set <String>> phonesBySurname;

    private Set<String> getPhones(String[] surname){
     Set<String> phones = phonesBySurname.getOrDefault(surname, new HashSet <>());
     if (phones.isEmpty()){
        phonesBySurname.put(surname, phones);
     }
        System.out.println(surname + " :" + phones);
     return phones;
    }
    public Phonebook() {
        phonesBySurname = new TreeMap <>();
    }
    @Override
    public void add(String[] surname, String[] phone) {
        Map <String, String> phoneBook = new HashMap <>();
        for (int i = 0; i < phone.length ; i++) {
            for (int j = 0; j < surname.length; j++) {
                if (i == j) {
                    phoneBook.putIfAbsent(phone[i], surname[j]);
                }
            }
        }
        for (Map.Entry <String, String> o: phoneBook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
    @Override
    public Set <String> get(String[] surname) {

        return getPhones(surname);
    }

    @Override
    public Set <String[]> getAllSurname() {
        return phonesBySurname.keySet();
    }


    public static void main(String[] args) {
        Map <String, String> phoneBook = new HashMap <>();
        String[] surnames = {"Petrov", "Ivanov", "Popov", "Petrov", "Semenov", "Shestakov", "Leonov", "Semenov"};
        String[] phones = {"456 789", "270 270", "154 123", "788 695", "785 695", "327 456", "270 275", "147 233"};
        Phonebook phonebook = new Phonebook();
        phonebook.add(surnames, phones);
        Set <String[]> allSurnames = phonebook.getAllSurname();
        for (String[] surname: allSurnames) {
            Set<String[]> phone = ( Set <String[]> ) phonebook.get(surname);
            System.out.println(surname + " : " + phone);
        }


    }
}
