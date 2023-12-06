package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class willItMatch {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("ab"); // would it match b?
        boolean b = m.matches();
        System.out.println(b);
    }
}
