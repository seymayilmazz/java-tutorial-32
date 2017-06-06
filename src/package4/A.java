package package4;

import package1.Person;

import java.util.List;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class A {

    public static void print(List<String> liste){

    }

    /*
     *      Person
     * Employee Student
     *              UniversityStudent
     */
    public static void sayHi(List<? extends Person> list){

    }


    public static void sayHello(List<? super Student> list){

    }


}
