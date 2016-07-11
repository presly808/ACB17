package ua.artcode.week3;

import ua.artcode.utils.ContactUtils;
import ua.artcode.week3.model.Address;
import ua.artcode.week3.model.Contact;
import ua.artcode.week3.model.MyDate;

/**
 * Created by serhii on 10.07.16.
 */
public class _04ComplexTask {


    public static void main(String[] args) {
        Contact contact1 = ContactUtils.init("Tima","022 23 23",30,'M',4000);

        Address address = new Address();
        address.city = "Kiev";
        address.street = "Starokievska";
        address.houseNum = "10";

        contact1.home = address;

        contact1.birth = new MyDate();
        contact1.birth.year = 1986;
        contact1.birth.month = 5;
        contact1.birth.day = 22;



    }
}
