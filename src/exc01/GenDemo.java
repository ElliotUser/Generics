package exc01;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение: "+v);

        Gen<String> strOb = new Gen<>("Hello World!");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: "+str);

    }
}
