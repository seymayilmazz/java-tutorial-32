package package4;

import package1.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        List<String> isimListesi = new ArrayList<>();
        List<Person> kisiListesi = new ArrayList<>();
        List<Employee> calisanListesi = new ArrayList<>();
        List<Student> ogrenciListesi = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();
        List<UniversityStudent> universityStudentList = new ArrayList<>();

        A.sayHi(kisiListesi);

        Box<Person> box1 = new Box<>();
    }

}
