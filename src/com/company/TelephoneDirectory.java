package com.company;

import java.util.Set;

public interface TelephoneDirectory {
    void add (String surname, String numberPhone);
    Set<String> get(String surname);
    Set<String> getAllSurname ();
}
