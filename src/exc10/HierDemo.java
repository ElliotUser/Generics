package exc10;

public class HierDemo {
    public static void main(String[] args) {
        Gen2a<String,Integer>x = new Gen2a<>("Значение равно: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());

    }
}
