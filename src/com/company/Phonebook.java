package com.company;

import java.util.*;

public class Phonebook implements TelephoneDirectory {

    private final Map <String, Set <String>> phoneWithSurnames;

    public Phonebook() {
        phoneWithSurnames = new TreeMap <>();
    }

    private Set <String> getPhones(String surname) {
        Set <String> phones = phoneWithSurnames.getOrDefault(surname, new HashSet <>());
        if (phones.isEmpty()) {
            phoneWithSurnames.put(surname, phones);
        }
        return phones;
    }


    @Override
    public void add(String phoneNumber, String surname) {
        Set <String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    @Override
    public Set <String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public Set <String> getAllSurname() {
        return phoneWithSurnames.keySet();
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("+7(905)349-13-35", "Ivanov");
        phonebook.add("+7(905)351-14-37", "Ivanov");
        phonebook.add("+7(927)685-15-75", "Ivanov");
        phonebook.add("+7(911)187-83-47", "Petrov");
        phonebook.add("+7(905)349-13-35", "Petrov");
        phonebook.add("+7(961)687-47-35", "Leonov");
        phonebook.add("+7(922)687-43-45", "Semenov");
        phonebook.add("+7(921)685-53-65", "Zaruckay");

        Set <String> allSurname = phonebook.getAllSurname();
        for (String surname : allSurname) {
            Set <String> phones = phonebook.get(surname);
            System.out.printf("%s : %s%n", surname, phones);
        }
        System.out.println();
//        System.out.println(phonebook);
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", Phonebook.class.getSimpleName() + "[", "]" )
                .add("phoneWithSurnames=" + phoneWithSurnames )
                .toString();
    }
}