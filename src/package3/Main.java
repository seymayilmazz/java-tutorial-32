package package3;

import package1.Person;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Main {

    public static void main(String[] args) {
        Box<Person> box1 = new Box<>();
        Person person1 = new Person();
        box1.set(person1);

        Box<String> box2 = new Box<>();
        box2.set("Hello World!");
    }
}
