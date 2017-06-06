package package4;

import package1.Person;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Box<T extends Person> {

    private T t;

    public void set(T t){
        this.t = t;
    }
}
