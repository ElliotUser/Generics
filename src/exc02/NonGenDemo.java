package exc02;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob = new NonGen(88);
        iob.showType();
        int v = (Integer) iob.getOb();
        System.out.println("Значение: "+v);
        System.out.println();

        NonGen strOb = new NonGen("Hello World!");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Значение: "+str);

        iob = strOb;
        v = (Integer) iob.getOb();


    }
}
