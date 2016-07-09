package ua.artcode.week2.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 03.07.16.
 */
public class _04MethodIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 25;

        int sqrt = (int)Math.sqrt(number);
        System.out.println(sqrt);

        int pow = (int)Math.pow(sqrt, 2);
        System.out.println(pow);

        System.out.println(Math.abs(-25));
//         Math.random() -> [0; 1)
        System.out.println((int)(Math.random() * 100));



    }
}
