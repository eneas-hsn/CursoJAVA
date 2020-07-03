package interativo;

import java.util.Scanner;

public class interact {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite seu nome");

        String name=scanner.nextLine();

        System.out.println("olá "+name);
    }
}
