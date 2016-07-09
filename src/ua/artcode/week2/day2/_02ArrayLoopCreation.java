package ua.artcode.week2.day2;

import ua.artcode.utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by gorobec on 03.07.16.
 */
public class _02ArrayLoopCreation {
    public static void main(String[] args) {
//        create scanner
        Scanner sc = new Scanner(System.in);
//        ask input size
        System.out.println("Enter mass length");
        int size = sc.nextInt();

        /*int[] mass = new int[size];

        for(int i = 0; i < mass.length; i++){
            mass[i] = i;
        }*/

        int[] mass = ArrayUtils.createAndFillArray(size);

        ArrayUtils.printArray(mass);

        /*for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();*/
    }
}
