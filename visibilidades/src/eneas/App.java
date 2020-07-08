package eneas;

import eneas.app.user;

public class App {
    public static void main(String[] args) {
        user userA=new user();
        userA.setFirstname("eneas neto");

        user userB=new user();
        userB.setFirstname("nome aleatorio");

        System.out.println(userB.getFirstname());
    }
}

