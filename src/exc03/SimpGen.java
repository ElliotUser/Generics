package exc03;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<>(88,"Hello World!");
        tgObj.showType();

        int v = tgObj.ob1;
        System.out.println("Значение: "+v);

        String str = tgObj.ob2;
        System.out.println("Значение: "+str);
    }
}
