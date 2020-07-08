package eneas;

import eneas.app.user;

public class App {
    public static void main(String[] args) {
        user[] users=new user[10];
        for(int i=0;i<users.length;i++){
            user atual=new user();
            atual.setFirstname("nome "+i );
            atual.setLastname("sobrenome "+i);
            users[i]=atual;
        }
        System.out.println(users[3].getFirstname());
    }
}

