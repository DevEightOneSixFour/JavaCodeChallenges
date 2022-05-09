package com.example.javachallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'areAlmostEquivalent' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY s
     *  2. STRING_ARRAY t
     */

    public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
        // Write your code here
        ArrayList<String> resultList = new ArrayList<>();
        HashMap<Character,Integer> mapAr1 = new HashMap<>();
        HashMap<Character,Integer> mapAr2 = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.size() - 1; i++) {
            String ar1 = s.get(i);
            String ar2 = t.get(i);

            for(int j = 0; j < ar1.length() - 1; j++) {
                Character c = ar1.charAt(j);
                if(!mapAr1.containsKey(c)) {
                    mapAr1.put(c, 1);
                    set.add(c);
                } else {
                    mapAr1.put(c, mapAr1.get(c)+ 1);
                }
            }

            for(int k = 0; k < ar2.length() - 1; k++) {
                Character c = ar2.charAt(k);
                if(!mapAr2.containsKey(c)) {
                    mapAr2.put(c, 1);
                    set.add(c);
                } else {
                    mapAr2.put(c, mapAr2.get(c)+ 1);
                }
            }
        }

        for(Character c : set) {
            int diff = mapAr1.get(c) - mapAr2.get(c);
            if(diff > 3) {
                resultList.add("NO");
            } else {
                resultList.add("YES");
            }
        }


        return resultList;
    }

}
public class AlmostTheSame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> s = IntStream.range(0, sCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int tCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> t = IntStream.range(0, tCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = Result.areAlmostEquivalent(s, t);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

