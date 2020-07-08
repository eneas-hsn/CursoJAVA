package eneas;

import eneas.app.user;

public class App {
    public static void main(String[] args) {
        user[] users=new user[]{
                new user("eneas","neto"),
                new user("joao"," da silva")
        };

        System.out.println(users[0].getFirstname());
        System.out.println(users[0].getLastname());
    }
}

