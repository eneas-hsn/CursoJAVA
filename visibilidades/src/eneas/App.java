package eneas;

import java.util.Scanner;

public class App {
//    escopo padrão (default)
    static double y=20;
//    visibilidade publica/ para todos os packages
    public static double x=25;
//    visibilidade private/ privada para todos os packages
    private static double z=15;

    public static void main(String[] args) {
        String password="123456en";
        System.out.println("Digite sua senha");
        Scanner scanner=new Scanner(System.in);
        String pass=scanner.nextLine();

        System.out.println(pass.equals(password));

//        MANIPULAÇÃO DE STRINGS
//        String x="  Hello world";
//        //quantidade de caracteres
//        System.out.println(x.length());
//        //concatenação
//        System.out.println(x+" e ae");
//        //ver se contem tal palavra
//        System.out.println(x.contains("hello"));
//        //ver onde começa tal palavra
//        System.out.println(x.indexOf("world"));
//        //capslock
//        System.out.println(x.toUpperCase());
//        //minusculo
//        System.out.println(x.toLowerCase());
//        //remove espaços desnecessarios
//        System.out.println(x.trim());
//        //ver texto a partir do numero selecionado
//        System.out.println(x.substring(4));
//        //da uma resposta booleana de acordo com uma comparação, vai ver se é igual
//        System.out.println(x.equals("eae"));
//

////        tipos primitivos
//        String a="eae";  //não é tipo primitivo, e sim um objeto
//        int b=5; //inteiros
//        double c=5.5; //quebrados
//        byte d=127; //espaço de um byte
//        short e=12; //int só que com menos espaço
//        long f=11; //int só que com mais espaço
//        float g=12.1f; //double com menos espaço
//        char h='a'; //apenas um caractere
//
////        conversão de tipo/casting
////        é só colocar o tipo no inicio entre parenteses
//        double z=22.2;
//        int y=2;
//        float x=(float)z/y;
//        System.out.println(x);

    }
}
