package exc09;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3,5,6,7,8};
        Character[] chs = {'a','d','y','e','q'};

        MyClass<Integer> iOb = new MyClass<>(inums);
        MyClass<Character> cOb = new MyClass<>(chs);

        System.out.println("Максимальное значение в массиве inums: "+iOb.max());
        System.out.println("Минимальное значение в массиве inum: "+iOb.min());

        System.out.println("Максимальное значение в массиве chs: "+cOb.max());
        System.out.println("Минимальное значение в массиве chs: "+cOb.min());




    }
}
