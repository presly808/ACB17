package ua.artcode.week3;

import ua.artcode.utils.ContactUtils;
import ua.artcode.week3.model.Contact;

/**
 * Created by serhii on 10.07.16.
 */
public class _03StructuresIntro {

    public static void main(String[] args) {
        System.out.println("begin");

        int[] mas = {2,3,4};
        String[] name = {"Ivan", "Oleg"};

        Contact[] list2 = new Contact[10];

        // Create reference to object type Contact, but assign null value
        Contact con4 = null;
        // int age2 = con4.age;
        // null.age NullPointerException

        // use created class
        // create object=instance(allocate memory(fields in Contact))
        // <type> <name> = new <type>();
        Contact con1 = new Contact();
        con1.name = "Andrey";
        con1.age = 18;
        con1.stipend = 2000.0;
        con1.phone = "066 2323 122";
        con1.sex = 'M';
        list2[0] = con1;

        System.out.println(ContactUtils.asString(con1));

        Contact con2 = new Contact();
        con2.name = "Lada";
        con2.age = 18;
        con2.stipend = 3000.0;
        con2.phone = "066 34 23 23";
        con2.sex = 'F';

        Contact con3 = ContactUtils.init("Lada", "066 34 23 23", 18, 'F', 3000.0);
        // find by name
        // change phone
        // change group

        Contact[] list = {con1,con2,con3};
        Contact ref1 = list[0];

        System.out.println("end");
    }

}

// create own class ->
// template, structure for future using
// name, phone, age, stipend, group, sex
