package exc08;

public class GenCons {
    private double val;

    <T extends Number>GenCons(T arg){
        val = arg.doubleValue();
    }

    public void showVal(){
        System.out.println("val: "+val);
    }
}
