package CostCount;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;


public class Cost {

        // Complete the stringConstruction function below.
        static int stringConstruction(String s) {

            return (int) s.chars().distinct().count();

        }

        public static void main(String[] args) throws IOException {
                String s = "abcd";
                int result = stringConstruction(s);
            System.out.println(result);
        }
}
