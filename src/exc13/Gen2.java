package exc13;

public class Gen2<T> extends Gen<T> {
    public Gen2(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.print("Метод gerob() из класса Gen2: ");
        return ob;
    }
}
