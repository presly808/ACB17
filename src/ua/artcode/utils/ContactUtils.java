package ua.artcode.utils;

import ua.artcode.week3.model.Contact;

/**
 * Created by serhii on 10.07.16.
 */
public class ContactUtils {
    public static Contact init(String name, String phone,
                               int age, char sex, double stipend) {
        Contact contact = new Contact();

        contact.name = name;
        contact.phone = phone;
        contact.age = age;
        contact.sex = sex;
        contact.stipend = stipend;

        return contact;
    }

    public static String asString(Contact contact){
        // byte,short,int,long %d
        // float, double %f
        // string %s
        String formatted =
                String.format("{name : %s, phone : %s, age : %d, sex : %s, stipend : %.2f}",
                contact.name, contact.phone, contact.age, contact.sex,contact.stipend);

        return formatted;

    }
}
