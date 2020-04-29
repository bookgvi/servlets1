package app.model;

import app.entities.Users;

import java.util.ArrayList;

public class Model {
    private static Model instance;
    private final ArrayList<Users> model;

    private Model() {
        this.model = new ArrayList<>();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public ArrayList<Users> getListOfUsers() {
        return model;
    }

    public Boolean addUser(Users user) {
        return model.add(user);
    }
}
