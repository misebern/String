package com.company;

public class Main {

    public static void main(String[] args) {
	// ganz kurz input string
        String str = "Hallo ZAM";

        System.out.println(str.length());
        System.out.println(str);

        // Strings dürfen nicht mit  == verglichen werden (machen was anderes = cliffhanger)
        // aber equals kann verwendet werden
        System.out.println(str.equals("Hallo ZAM"));


    }
}
