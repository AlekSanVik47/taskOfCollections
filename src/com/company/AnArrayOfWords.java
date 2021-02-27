package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class AnArrayOfWords {
    private void UniqueArray (String[] words){
        Set <String> uniqueWords = new HashSet <>();
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase(Locale.ROOT);
        }
        Collections.addAll(uniqueWords, words);
        System.out.println(uniqueWords);
        System.out.printf("Уникальных слов встречается %s", uniqueWords.size());
    }

    public static void main(String[] args) {
        String[] words = {"Друзья", "Взгляд", "Глаза",
                "Игра", "Улыбка", "Радость", "Ученье", "Жизнь", "Игра", "Улыбка",
                "Радость", "Ученье", "Смех", "Успех", "Школа", "Доллар", "Золото",
                "Погода", "доллар"};

        AnArrayOfWords anArrayOfWords = new AnArrayOfWords();
        anArrayOfWords.UniqueArray(words);
    }
}
