package exc01;

public class Gen<T> {
    T ob;

    public Gen(T o) {
        this.ob = o;
    }

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println("Тип Т является "+ob.getClass().getName());
    }
}
