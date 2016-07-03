package ua.artcode.utils;

/**
 * Created by gorobec on 03.07.16.
 */
public class ArrayUtils {
//    return type - data type or void
//    methodName - verb
//    args - argsType argsName

//    public static <return type> <methodName>(<args>)

//    return type - data type or void
//    methodName - verb
//    args - without args

//    public static <return type> <methodName>()\

    public static void printArray(int[] array){
//        logic

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(String[] array){
//        logic

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
    public static int[] createAndFillArrayBackward(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i - 1;
        }

        return array;
    }
    public static int[] createAndFillRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(min + Math.random() * (max - min));
        }

        return array;
    }

    public static void bubbleSort(int[] array){
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]){
//                swap
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }
}
