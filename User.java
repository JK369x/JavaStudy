public class User {

     private String name, id, pass;
     private Double account;

     User() {}
     User(String name, String id, String pass, Double account) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.account = account;
     }



    public String getName55() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getAccount() {
        return this.account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }   
}
