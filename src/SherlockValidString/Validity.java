package SherlockValidString;

import java.io.IOException;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Validity {
        // Complete the isValid function below.
        static String isValid(String s) {
            int counts = 0;
            int diff = 0;
            char[] ch = s.toCharArray();
            Map<Character, Integer> occurrencesMap = new HashMap<>();
            occurrencesMap.size();
            for (int i = 0; i < ch.length; i++) {

                if (occurrencesMap.containsKey(ch[i])) {
                    Integer count = occurrencesMap.get(ch[i]);
                    if (count == 0) {
                        occurrencesMap.put(ch[i], 1);
                    } else {
                        occurrencesMap.put(ch[i], count + 1);
                    }
                } else {
                    occurrencesMap.put(ch[i], 1);
                }
            }
            Iterator<Integer> itr = occurrencesMap.values().iterator();

            // declaration of variables
            boolean first = true, second = true;
            int val1 = 0, val2 = 0;
            int countOfVal1 = 0, countOfVal2 = 0;

            while (itr.hasNext()) {
                int i = itr.next();

                // if first is true than countOfVal1 increase
                if (first) {
                    val1 = i;
                    first = false;
                    countOfVal1++;
                    continue;
                }

                if (i == val1) {
                    countOfVal1++;
                    continue;
                }

                // if second is true than countOfVal2 increase
                if (second) {
                    val2 = i;
                    countOfVal2++;
                    second = false;
                    continue;
                }

                if (i == val2) {
                    countOfVal2++;
                    continue;
                }

                return "NO";
            }

            if (countOfVal1 > 1 && countOfVal2 > 1) {
                return "NO";
            } else {
                return "YES";
            }
        }

            public static void main(String[] args) throws IOException {
            String s = "aabbccddeefghi";
            String result = isValid(s);
            System.out.println(result);
        }


}
