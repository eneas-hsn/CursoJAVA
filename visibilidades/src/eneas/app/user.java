package eneas.app;

public class user {
    private String firstname;
    private String lastname;

    //construtor
    public user(String firstname,String lastname){
        this.firstname=firstname.toUpperCase();
        this.lastname=lastname;
    }

    // set diz o que será a propriedade
    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }
    //get retorna o que é a propriedade
    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public String getLastname() {
        return lastname;
    }
}

