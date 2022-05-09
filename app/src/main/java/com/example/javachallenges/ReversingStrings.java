package com.example.javachallenges;

import android.util.Log;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReversingStrings {
    public static void main(String[] args) {

        String originalStr = "how to do in java";

        reverseWords(originalStr);
        reverseSentence(originalStr);

    }
    public void usingClassMethod() {
        AnyType<Double> type = new AnyType<>();

        type.setObject(10.1);
        type.setObject(17.2);

        AnyType<Character> type2 = new AnyType<>();

        type2.setObject('A');
        type2.setObject('B');
    }

    public static void reverseWords(String str) {
        String words[] = str.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        // Displaying the string after reverse
        System.out.println("Reversed string : " + reversedString);
    }

    public static void reverseSentence(String str) {
        // Pregunta de prueba
//        Map<String, List<String>> map  = new HashMap<>();
//        map.put("KEY", new ArrayList<>());
//        List<> vale = map.get("KEY");

        String words[] = str.split("\\s");
        String reversedString = "";

        //Reverse each word's position
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }

        // Displaying the string after reverse
        Log.d("*****","Reversed string : " + reversedString );
        System.out.print("Reversed string : " + reversedString);
    }

    public static Long sumAndBit() {
        Long result = 0L;
        int[] array = new int[] {1,2,3};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                if (set.contains(array[j])) {
                    continue;
                } else {
                    result += i & j;
                }
            }
            set.add(i);
        }
        return result;
    }
}
