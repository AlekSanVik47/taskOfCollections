package com.company;

import java.util.*;

public class AnArrayOfWords  {
    Set<String> words = new HashSet <>();


 private void UniqueArray (List<String> words){
     Set <String> uniqueWords = new HashSet <>();
     String wordCount = "Unique words";
     for (int i = 0; i < words.size(); i++) {
         for (String word : words) {
             if (word.equalsIgnoreCase((words.get(i))))
                 uniqueWords.remove(word);
                 uniqueWords.add(words.get(i));
         }
     }
     System.out.printf("%s: %d%n", wordCount, uniqueWords.size());
     System.out.println(uniqueWords);
 }

    public static void main(String[] args) {
        String[] words = {"друзья", "Взгляд", "Глаза",
                "Игра", "улыбка", "Радость", "Ученье", "Жизнь", "Игра", "Улыбка",
                "Радость", "Ученье", "Смех", "Успех", "Школа", "Доллар", "Золото",
                "Погода", "доллар"};
        List <String> wordsList = new ArrayList <>(Arrays.asList(words));

        AnArrayOfWords arrayOfWords = new AnArrayOfWords();
        arrayOfWords.UniqueArray(wordsList);
        }

        @Override
    public String toString() {
        return new StringJoiner(", ", AnArrayOfWords.class.getSimpleName() + "[", "]")
                .add("words=" + words)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnArrayOfWords that = ( AnArrayOfWords ) o;
        return Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
