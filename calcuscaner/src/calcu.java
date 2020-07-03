import java.util.Scanner;

public class calcu {

    public static void main(String[] args) {
        if (args[0].equals("soma")) {
            int x= Integer.parseInt(args[0]);
            int y= Integer.parseInt(args[1]);
            System.out.println("digite dois números");
            sum(x,y);
        }

    }
    static void sum(double x, double y){
        System.out.println(x+y);
    }

}
