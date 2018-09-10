package exc04.exc04a;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer>iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно "+v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно "+w);

        //Этот код не скомпилируется, так как класс String
        //не является производным от класса Number
//        String strs[] = {"A","B","C","D","E","F","G","H"};
//        Stats<String> strOb = new Stats<String>(strs);
//        double x = strOb.average();
//        System.out.println("Среднее значение strOb равно "+x);
    }
}
