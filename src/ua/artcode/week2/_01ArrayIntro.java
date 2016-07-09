package ua.artcode.week2;

/**
 * Created by serhii on 02.07.16.
 */
public class _01ArrayIntro {
    public static void main(String[] args) {
        int day1 = 4;
        int day2 = 2;
        int day3 = 7;
        int day4 = 12;
        int day5 = 8;
        // groups
        // names, days, words, results

        //
        int[] arr = new int[7];
        //  arr -> {_ _ _ _ _ _ _}
        //          0 1 2 3 4 5 6
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 12;
        arr[4] = 8;

        //int el1 = arr[-1];
        //int el2 = arr[arr.length];

        int size = arr.length;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        int[] arr1 = {4,2,7,12,8,0,0};

        double[] arr2 = new double[4];

        String[] arr3 = {"Kolia", "Andrey", "Ivan", "Lada"};
        arr3[2] = "Serhii";

        System.out.println("Hello " + arr3[2]);
        // <type>[] name = new <type>[<size>];
        // <type>[] name = {<val1>, <val2>, <val3>};

        /*int[] arr4 = null;
        int sizeArr4 = arr4.length;
        int elArr4 = arr4[0];*/

        int[] arr5 = new int[10];
        System.out.println(arr5[0]);

        // default arr values
        // byte,short, int, long -> 0
        // float, double -> 0.0
        // boolean -> false
        // char -> 0 '\u0000' ''




    }
}
