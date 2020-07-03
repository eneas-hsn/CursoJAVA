import eneas.com.user;

import java.util.Random;

public class megacenaa {
    public static void main(String[] args) {
        int x;
        user user= new user();
        Random generate = new Random();

        for (int i=0;i<6;i++){
            int number=generate.nextInt(60);
            System.out.println(number);
        }
        user users=new user();
//        int i=0;
//        while(i<6){
//            int number =generate.nextInt(60);
//            System.out.println(number);
//            i++;
//        }

    }

}
