package com.example;


import java.util.List;

/*
    Release solution!

 */
public class Solution {

    public String getResult(List<Character> characterList, List<String> stringList) {

        try {
            if (!characterList.isEmpty()) {
                for (Character character : characterList) {
                    validation(character, characterList, stringList);
                }
            }

        } catch (Exception ex) {

        }
        return stringList.get(0);
    }

    public void validation(char c, List<Character> characterList, List<String> stringList) {
        int indexSymbol = characterList.indexOf(c);
        int res;
        if (c == '+' && !(characterList.contains('*') || characterList.contains('/')) && !(characterList.contains('^'))) {
            res = Integer.parseInt(stringList.get(indexSymbol)) + Integer.parseInt(stringList.get(indexSymbol + 1));
            arifmetikDoing(c, res, characterList, stringList);
        }
        if (c == '-' && !(characterList.contains('*') || characterList.contains('/')) && !(characterList.contains('^'))) {
            res = Integer.parseInt(stringList.get(indexSymbol)) - Integer.parseInt(stringList.get(indexSymbol + 1));
            arifmetikDoing(c, res, characterList, stringList);
        }
        if (c == '*' && !(characterList.contains('^'))) {
            res = Integer.parseInt(stringList.get(indexSymbol)) * Integer.parseInt(stringList.get(indexSymbol + 1));
            arifmetikDoing(c, res, characterList, stringList);
        }
        if (c == '/' && !(characterList.contains('^'))) {
            res = Integer.parseInt(stringList.get(indexSymbol)) / Integer.parseInt(stringList.get(indexSymbol + 1));
            arifmetikDoing(c, res, characterList, stringList);
        }
        if (c == '^') {
            res = (int) Math.pow(Double.parseDouble(stringList.get(indexSymbol)), Double.parseDouble(stringList.get(indexSymbol + 1)));
            arifmetikDoing(c, res, characterList, stringList);
        }


    }

    public void arifmetikDoing(char c, int res, List<Character> characterList, List<String> stringList) {
        int indexSymbol = characterList.indexOf(c);
        String reS = String.valueOf(res);
        stringList.set(indexSymbol, reS);
        characterList.remove(indexSymbol);
        stringList.remove(indexSymbol + 1);
        getResult(characterList, stringList);
    }

}
