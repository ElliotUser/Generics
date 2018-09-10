package exc03;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    public TwoGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    void showType(){
        System.out.println("Тип Т: "+ob1.getClass().getName());

        System.out.println("Тип V: "+ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}
