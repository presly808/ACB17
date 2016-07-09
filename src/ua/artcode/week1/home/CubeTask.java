package ua.artcode.week1.home;

import java.util.Scanner;

public class CubeTask {

    public static void main(String[] args) {
        /*Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
        тельные заменить на 0.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first");
        int num1 = sc.nextInt();
        System.out.println("Input second");
        int num2 = sc.nextInt();
        System.out.println("Input third");
        int num3 = sc.nextInt();

        System.out.println(num1 + ", " + num2 + ", " + num3);

        if(num1 > 0){
            num1 = num1 * num1 * num1;
            // num1 = (int) Math.pow(num1,3);
        } else if(num1 < 0){
            num1 = 0;
        }
        // ternary operator
        num1 = num1 > 0 ? (num1 * num1 * num1) : 0;

        // varName = <condition> ? expression : expression;


        if(num2 > 0){
            num2 = num2 * num2 * num2;
        } else if(num2 < 0){
            num2 = 0;
        }

        if(num3 > 0){
            num3 = num3 * num3 * num3;
        } else if(num3 < 0){
            num3 = 0;
        }

        System.out.println("After actions");
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }

}
