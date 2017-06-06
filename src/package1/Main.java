package package1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        //Class personClassInfo = package1.Person.class;
        Person person1 = new Person();
        Class personClassInfo = person1.getClass();

        System.out.println("simple name : " + Person.class.getSimpleName());
        Method[] methods = personClassInfo.getMethods();
        System.out.println("------Methods------");
        for(Method method : methods){
            System.out.println(method.getName());
        }
        Field[] fields = personClassInfo.getFields();
        System.out.println("------Fields------");
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }

}
