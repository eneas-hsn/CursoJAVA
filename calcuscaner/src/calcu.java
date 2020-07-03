import java.util.Scanner;

public class calcu {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("type two numbers");
        double number1= Double.parseDouble(scanner.nextLine());
        double number2= Double.parseDouble(scanner.nextLine());


        System.out.println(number1+number2);

    }


}
