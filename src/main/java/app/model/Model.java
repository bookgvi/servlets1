package app.model;

import app.entities.User;

import java.util.HashSet;

public class Model {
    private static Model instance;
    private final HashSet<User> model;

    private Model() {
        this.model = new HashSet<>();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public HashSet<User> getListOfUsers() {
        return model;
    }

    public Boolean addUser(User user) {
        return model.add(user);
    }
}
