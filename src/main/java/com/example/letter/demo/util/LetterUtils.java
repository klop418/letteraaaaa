package com.example.letter.demo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Alphabet tool class
 *
 * @author guweifeng
 * @date 2021-03-13 21:56:31
 */
public class LetterUtils {



    public  static List<String> letterCombinations(String digits) {
        Map<String,String> map = new HashMap<>();
        map.put("0","");
        map.put("1","");
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }

        // The letter on the button where the first number is located
        String str = map.get(String.valueOf(digits.charAt(0)));

        // If the length is 1, return the letters on the button respectively
        if (digits.length() == 1) {

            if (str != null && str.length()>0){
                for (int i = 0; i < str.length(); i++) {
                    result.add(str.substring(i, i + 1));
                }
            }
            return result;
        }


        // If the length is greater than 1, it is solved recursively
        List<String> combinations = letterCombinations(digits.substring(1));
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i + 1);
            for (String combination : combinations) {
                result.add(letter + combination);
            }
        }
        return result;
    }

    public  static List<String> letterCombinations(Integer[] list){
        if (list == null || list.length == 0){
            return new ArrayList<>();
        }
        List<String> resultList = new ArrayList<>();
        for (Integer i: list){
            String numStr = String.valueOf(i);
            resultList.addAll(letterCombinations(numStr));
        }
        return resultList;
    }
}
