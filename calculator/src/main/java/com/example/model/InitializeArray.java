package com.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    Created two lists. First contain numbers, second contain symbol!
 */
public class InitializeArray {
    private List<Character> characterList;
    private List<String> stringList;

    public InitializeArray() {

    }

    public void init(String line) {
        stringList = new ArrayList<>(Arrays.asList(line.split("[+*^/-]")));
        characterList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            /*
                Check line to symbols and if line contain them, add symbols at list.
             */
            if (c == '/' || c == '*' || c == '+' || c == '-' || c=='^')
                characterList.add(c);
        }
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public List<String> getStringList() {
        return stringList;
    }
}
