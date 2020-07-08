package eneas.app;

public class user {
    private String firstname;
    private String lastname;

    public void setFirstname(String firstname) {
        this.firstname=firstname.toUpperCase();
    }
    public String getFirstname(){
        return firstname;
    }
}

