package ua.artcode.week2.day2;

/**
 * Created by gorobec on 03.07.16.
 */
public class _01ArrayIntro {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int[] array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
