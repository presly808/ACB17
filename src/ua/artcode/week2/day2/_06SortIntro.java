package ua.artcode.week2.day2;

import ua.artcode.utils.ArrayUtils;

/**
 * Created by gorobec on 03.07.16.
 */
public class _06SortIntro {
    public static void main(String[] args) {
//        char[] letters = {'a', 'b', 'c', 'e', 'd'};

        int[] array = ArrayUtils.createAndFillRandomArray(15, 0, 100);
        ArrayUtils.printArray(array);
//        sorting


        ArrayUtils.bubbleSort(array);

        ArrayUtils.printArray(array);

    }
}
