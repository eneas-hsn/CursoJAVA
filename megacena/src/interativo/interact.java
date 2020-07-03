package interativo;

import java.util.Scanner;

public class interact {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("type your name");

        String name=scanner.nextLine();


        System.out.println("hello "+name);
    }
}
