package com.lambton;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class StringHandling {
    public static void main(String[] args) {

        String pattern = "###,###,##.00";
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern(pattern);
        int value = 12345678;
        String output = decimalFormat.format(value);
        System.out.println(value + " " + pattern + " " + output);

        // date and time
        System.out.println(LocalDateTime.now());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = null;
        String s4 = new String("Hello");
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        if (s3 == s2) {
            System.out.println("s3 == s2");
        } else {
            System.out.println("s3 != s2");
        }
        if (s1 == s4) {
            System.out.println("s1 == s4");
        } else {
            System.out.println("s1 != s4");
        }
        if (s1.equals(s4)) {
            System.out.println("s1 == s4");
        } else {
            System.out.println("s1 != s4");
        }
        String collegeName = "Lambton College in Toronto";
        // find the length

        int length = collegeName.length();
        System.out.println(length);
        // find the index of toronto
        int index = collegeName.indexOf("Toronto");
        System.out.println(index);
        // find the word college
        Boolean b = collegeName.contains("Toronto");
        System.out.println(b);

        int a[] = {1, 2, 3, 4, 5};
        // To show the name as one character in one line

        char c[] = collegeName.toCharArray();
        char rev[] = new char[c.length];
        int cnt = 0;
        for(int i = c.length-1; i>=0; i--)
        {
            rev[cnt++] = c[i];
        }
        String reverseString = new String(rev);
        System.out.println(" Reverse String =" + reverseString);
        // Reverse only even position words
        // input: lambton college in toronto
        //Output: lambton egelloc in otnoroT



    }



}
