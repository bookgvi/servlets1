package app.entities;

import java.util.Objects;

public class User {
    private String name;
    private String pass;

    public User() {}

    public User(String name, String pass) {
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
