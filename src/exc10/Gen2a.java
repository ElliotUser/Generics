package exc10;

public class Gen2a<T,V> extends Gen<T> {
    V ob2;

    public Gen2a(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}
