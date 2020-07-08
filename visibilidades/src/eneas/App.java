package eneas;

import eneas.app.user;

public class App {
    public static void main(String[] args) {
        user userA=new user();
        userA.setFirstname("eneas neto");

        user userB=new user();
        userB.setFirstname("nome aleatorio");
        userB.setLastname("ponto COM");

        System.out.println(userB.getFirstname());
        System.out.println(userB.getLastname());
    }
}

