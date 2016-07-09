package ua.artcode.week2.day2;

/**
 * Created by gorobec on 03.07.16.
 */
public class _07ReferenceDataTypes {
    public static void main(String[] args) {
//        first
        String name = "Lada";

//        second
        char[] letters = {'A', 'l', 'l', 'a'};
        System.out.println(letters);
        String name2 = new String(letters);

//        third
        String name3 = new String("Lada");
        String name4 = "Lada";

        System.out.println(name);
        System.out.println(name2);
    }
}
