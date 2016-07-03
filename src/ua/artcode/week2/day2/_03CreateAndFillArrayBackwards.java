package ua.artcode.week2.day2;

import ua.artcode.utils.ArrayUtils;

/**
 * Created by gorobec on 03.07.16.
 */
public class _03CreateAndFillArrayBackwards {
    public static void main(String[] args) {
//        create and fill array 15 -> 0

        int size = 16;
        int[] arr = ArrayUtils.createAndFillArrayBackward(size);

        /*new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = size - i - 1;
        }*/
        /*size--;
        for (int i = 0; i < arr.length; i++, size--) {
            arr[i] = size;
        }*/

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/
        ArrayUtils.printArray(arr);
    }
}
