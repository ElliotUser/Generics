package exc11;

public class Gen<T> extends NonGen {
    T ob;

    public Gen( T ob,int num) {
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }


}
