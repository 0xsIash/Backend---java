package model;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private List<User> users = new ArrayList<>();
    private Admin admin;

    // responsibilities
    public void addUser(User user){

    }

    public User authenticate(String userName, String password){
        return null;
    }

    public User findUser(String userName){
        return null;
    }

}
