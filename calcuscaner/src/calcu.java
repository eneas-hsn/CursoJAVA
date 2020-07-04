import java.util.Scanner;

public class calcu {

    public static void main(String[] args) {
        System.out.println("DIGITE UMA DAS OPCOES:"+"'somar' "+"'diminuir' "+"'multiplicar' "+"'dividir'");
        Scanner scanner=new Scanner(System.in);
        String function=scanner.nextLine();
        System.out.println();
        if (function.equals("somar")){
            System.out.println("digite dois números para soma");

            double number1= Double.parseDouble(scanner.nextLine());
            double number2= Double.parseDouble(scanner.nextLine());

            System.out.println("sua soma deu "+(number1+number2));
        } else if (function.equals("diminuir")){
                System.out.println("digite dois números para subtrair");

                double number1= Double.parseDouble(scanner.nextLine());
                double number2= Double.parseDouble(scanner.nextLine());

                System.out.println("sua subtracao deu "+(number1-number2));
        } else if (function.equals("multiplicar")){
            System.out.println("digite dois números para subtrair");

            double number1= Double.parseDouble(scanner.nextLine());
            double number2= Double.parseDouble(scanner.nextLine());

            System.out.println("sua multiplicação deu "+(number1*number2));
        }  else if (function.equals("dividir")){
            System.out.println("digite dois números para dividir");

            double number1= Double.parseDouble(scanner.nextLine());
            double number2= Double.parseDouble(scanner.nextLine());

            System.out.println("sua divisão deu "+(number1/number2));
        }

    }


}
