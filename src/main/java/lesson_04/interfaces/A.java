package lesson_04.interfaces;

/**
 * Created by kaim on 6/25/18.
 */
public interface A {
    int NUM = 0;

    void vvv();
}

interface B extends A{

}

class C implements A{

    @Override
    public void vvv() {

    }
}