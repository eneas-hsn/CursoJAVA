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

    public void setLastname(String lastname){
        this.lastname=lastname.toLowerCase();
    }

    public String getLastname() {
        return lastname;
    }
}

