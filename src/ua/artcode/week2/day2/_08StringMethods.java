package ua.artcode.week2.day2;

import ua.artcode.utils.ArrayUtils;

/**
 * Created by gorobec on 03.07.16.
 */
public class _08StringMethods {
    public static void main(String[] args) {
        String name = "Lada";
        String name3 = new String("Lada");
        String name4 = "Lada";
        String name5 = "lada";

        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name5));

        String subString =name.substring(0, 2);
        System.out.println(name);
        name.length();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        System.out.println(name + " " + name3);
        System.out.println(name.concat(" ").concat(name3));
        System.out.println(name.charAt(1));
        System.out.println(name.startsWith("L"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));

        String sentence = "Mama mula ramu";
        String[] words = sentence.split(" ");
        ArrayUtils.printArray(words);
    }
}
