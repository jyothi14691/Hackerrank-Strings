package AlternateStrings;

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

public class Solution {

    // Complete the alternate function below.
    static int alternate(String s) {
        int count = 0;
        for(int i = 0 ;i <( s.length()-1);i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    count++;
                }
        }
       return count;
    }

    public static void main(String[] args) throws IOException {
        String s = "abaacdabd";
        int result = alternate(s);
        System.out.println(result);
    }
}

