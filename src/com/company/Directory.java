package com.company;

import java.util.Set;

public interface Directory {
    void add(String[] surname, String[] phone);
    Set <String> get(String[] surname);
    Set <String[]> getAllSurname();
}
