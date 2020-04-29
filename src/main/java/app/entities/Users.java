package app.entities;

public class Users {
    private String name;
    private String pass;

    public Users() {}

    public Users(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return this.pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Users: {" +
                "name: '" + this.name + '\'' +
                ", password: '" + this.pass + '\'' +
                "}";
    }
}
