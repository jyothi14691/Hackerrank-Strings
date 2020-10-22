package CostCount;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class Anagrams {
        // Complete the sherlockAndAnagrams function below.
        static int sherlockAndAnagrams(String s) {
            int count = 1;
            List<String> subStr = new ArrayList<>();
            for(int i = 0; i < s.length();i++){
                for(int j = i+1; j <s.length()+1;j++){
                    subStr.add(s.substring(i,j)) ;
                }
            }
            String[] allStr = new String[subStr.size()];
                    allStr = subStr.toArray(allStr);
            for(int i = 0; i < allStr.length ;i++){
                for(int j = 1; j <allStr.length ;j++){

                    Boolean isAnagramPair = isAnagram(allStr[i],allStr[j]);
                    if(isAnagramPair){
                        count++;
                    }
                }
            }
            System.out.println(count);
            return count;
        }

        public static Boolean isAnagram(String s1, String s2){
            if(s1.length() != s2.length()){
                return false;
            }
            else if(s1.equals(s2)){
                return false;
            }
            char[] s1c = s1.toCharArray();
            char[] s2c = s2.toCharArray();
            Arrays.sort(s1c);
            Arrays.sort(s2c);
           return Arrays.equals(s1c,s2c);
        }

        public static void main(String[] args) throws IOException {
            String s= "cdcd";
                int result = sherlockAndAnagrams(s);
        }
}
