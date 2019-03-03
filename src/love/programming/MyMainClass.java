package love.programming;

import java.sql.SQLOutput;

public class MyMainClass {
    public static void main(String[] args) {
        Person personObject1 = new Person();
        Person personObject2 = new Person();
        Person personObject3 = new Person();
        Person personObject4 = new Person();
        personObject1.setFirstName("Kiya");
        personObject2.setFirstName("Diya");
        personObject3.setFirstName("Miya");
        personObject4.setFirstName("Riya");
        personObject1.setLastName("Reddy");
        System.out.println(personObject1.getFirstName()+ personObject1.getLastName());
        System.out.println(personObject2.getFirstName()+ personObject2.getLastName());

    }

}
