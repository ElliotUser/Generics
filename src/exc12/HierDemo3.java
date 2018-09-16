package exc12;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        Gen2<Integer> iOb2 = new Gen2<>(99);

        Gen2<String> strOb3 = new Gen2<>("Test messages");

        if(iOb2 instanceof Gen2<?>) System.out.println("Объект iOb2 является экземпляром класса Gen2");

        if(iOb2 instanceof Gen<?>) System.out.println("Объект iOb2 является экземпляром класса Gen");

        System.out.println();

        if(strOb3 instanceof Gen2<?>) System.out.println("Объект strOb2 является экземпляром класса Gen2");

        if(strOb3 instanceof Gen<?>) System.out.println("Объект strOb2 является экземпляром класса Gen");

        System.out.println();

        if(iOb instanceof Gen2<?>) System.out.println("Объект iOb является экземпляром класса Gen2");

        if(iOb instanceof Gen<?>) System.out.println("Объект iOb является экземпляром класса Gen");

//        if(iOb2 instanceof Gen2<Integer>) System.out.println("Объект iOb2 является экземпляром класса Gen2<Integer>");
    }
}
