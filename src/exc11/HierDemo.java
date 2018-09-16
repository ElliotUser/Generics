package exc11;

public class HierDemo {
    public static void main(String[] args) {
        Gen<String> w = new Gen<>("Welcome", 47);

        System.out.print(w.getOb()+" ");
        System.out.println(w.getNum());
    }
}
