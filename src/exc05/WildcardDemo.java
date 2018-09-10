package exc05;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно "+v);


        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно "+w);

        Float[] fnums = {1.0f,2.0f,3.0f,4.0f,5.0f};
        Stats<Float> fOb = new Stats<>(fnums);
        double x = fOb.average();
        System.out.println("Среднее значение fOb равно "+x);

        System.out.print("Средние значения iob и dob ");
        if(iOb.sameAvg(dOb))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");


        System.out.print("Средние значения iob и fob ");
        if(iOb.sameAvg(fOb))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");
    }
}
