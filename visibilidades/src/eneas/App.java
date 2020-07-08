package eneas;

import eneas.app.user;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<user> users=new ArrayList<>();

        for(int i=0;i<10;i++){
            user atual=new user("nome "+i,"sobrenome "+i);
            users.add(atual);
        }
        System.out.println(users.get(0).getFirstname());
        System.out.println(users.get(0).getLastname());

        user user11=new user("zé","vieira");
        users.add(user11);
        System.out.println(users.get(10).getFirstname());

    }
}

