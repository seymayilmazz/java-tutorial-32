package package3;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Box <T> {

    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

}
