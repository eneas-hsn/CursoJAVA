package eneas.app;
import eneas.App;
public class user {
    private boolean isLogged;
    public String lastname;
    public String firstname;
    public String fullName;


    public String getFullName(){
        return firstname+" "+lastname;

    }

    public void setLogged(boolean logged){
        isLogged=logged;
    }
}
