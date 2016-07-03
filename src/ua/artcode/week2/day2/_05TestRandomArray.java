package ua.artcode.week2.day2;

import ua.artcode.utils.ArrayUtils;

/**
 * Created by gorobec on 03.07.16.
 */
public class _05TestRandomArray {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillRandomArray(10, 25, 75);
        ArrayUtils.printArray(array);
    }
}
