import builderPattern.*;
import singletonePattern.SingletonLazyLoad;
import singletonePattern.SingletonSimple;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //implementing all kinds of singleton patterns
        SingletonSimple instance = SingletonSimple.getInstance();
        SingletonSimple instance2 = SingletonSimple.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);

        SingletonLazyLoad newInstance = SingletonLazyLoad.getInstance();
        System.out.println(newInstance);

        //implementing a simple builder pattern
        Name initialName = new Name.Builder()
                .firstname("Tahoora")
                .middleName(List.of("Fatemeh"))
                .surname("Mirbeigi")
                .build();

        Address initialAddress = new Address.Builder()
                .houseNumber(123)
                .street("Yazd")
                .zipcode("1234")
                .city("Yazd")
                .build();

        Account account = new Account.Builder()
                .id(123)
                .email("tahoo@yahoo.com")
                .name(initialName)
                .address(initialAddress)
                .build();


        PersonAddress personAddress = new PersonAddress.Builder()
                .zipcode("123")
                .city("Yazd")
                .build();

        Person.Builder personNew = new Person.Builder();
        personNew.personAddress(personAddress);
        System.out.println(personNew);

        Person person2 = new Person.Builder()
                .id(123L)
                .firstname("Tahoo")
                .build();

        System.out.println(person2);
    }

    //second way of creating an instance
    Account.Builder account2 = new Account.Builder();


}