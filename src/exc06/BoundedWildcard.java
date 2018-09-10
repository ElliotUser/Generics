package exc06;

public class BoundedWildcard {
    static void showXY(Coords<?>c){
        System.out.println("Координаты X Y: ");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD>c){
        System.out.println("Координаты X Y Z: ");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD>c) {
        System.out.println("Координаты X Y Z T: ");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z + " " +
                               c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD twoD[] = {
                       new TwoD(0,0),
                       new TwoD(7,8),
                       new TwoD(19,-4),
                       new TwoD(-1,-23)
                      };

        Coords<TwoD> tdlocs = new Coords<>(twoD);

        System.out.println("Содержание объекта tdlocs.");
        showXY(tdlocs);
//        showXYZ(tdlocs);
//        showAll(tdlocs);


        FourD fourD[] = {
                         new FourD(3,2,4,5),
                         new FourD(7,8,43,5),
                         new FourD(19,54,99,-100),
                         new FourD(-1,-3,45,2)
                        };
        Coords<FourD> fdlocs = new Coords<>(fourD);

        System.out.println("Содержание объекта fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}
