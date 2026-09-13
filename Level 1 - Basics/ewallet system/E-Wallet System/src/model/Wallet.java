package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Wallet {
    private final List<User> users = new ArrayList<>();
    private Admin admin;

    // responsibilities

    // Signup validation
    public String validateName(String name){
        if(name.length() < 3){
            return "Name must be at least 3 characters long.";
        }
        if(name.charAt(0) < 'A' || name.charAt(0) > 'Z'){
            return "First character must be uppercase.";
        }

        Predicate<User> checkName = n -> Objects.equals(n.getUserName(), name);
        if(users.stream().anyMatch(checkName)){
            return "Username is already exist";
        }
        return "valid";
    }

    public String validatePassword(String password){
        if(password.length() < 8){
            return "Password must be at least 8 characters long.";
        }

        boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = password.chars().anyMatch(Character::isLowerCase);
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = password.chars().anyMatch(
                c -> !Character.isLetterOrDigit(c)
        );

        if (!hasUpper) {
            return "Password must contain an uppercase letter.";
        }

        if (!hasLower) {
            return "Password must contain a lowercase letter.";
        }

        if (!hasDigit) {
            return "Password must contain a digit.";
        }

        if (!hasSpecial) {
            return "Password must contain a special character.";
        }

        return "valid";
    }

    public String validateAge(int age){
        if(age<18){
            return "Age must be +18";
        }

        return "valid";
    }

    public String validatePhoneNumber(String phoneNumber) {

        if (phoneNumber.length() != 11) {
            return "Phone number must be 11 digits.";
        }

        if (!phoneNumber.chars().allMatch(Character::isDigit)) {
            return "Phone number must contain digits only.";
        }

        if (!phoneNumber.startsWith("01")) {
            return "Phone number must start with 01.";
        }

        Predicate<User> checkPhoneNumber =
                n -> Objects.equals(n.getPhoneNumber(), phoneNumber);

        if (users.stream().anyMatch(checkPhoneNumber)) {
            return "Phone number already exists.";
        }

        return "valid";
    }

    public void addUser(User user) {

        users.add(user);
        System.out.println("User has been added successfully :)");
    }


    // Login validation
    public boolean checkIfNameNOTExist(String name){


        Predicate<User> checkName = n -> Objects.equals(n.getUserName(), name);
        return users.stream().noneMatch(checkName);

    }

    public User findUser(String userName){

        return users.stream().filter(n->n.getUserName().equals(userName))
                .findAny()
                .orElse(null);
    }

    public User authenticate(String name, String password) {

        User user = findUser(name);

        if (user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}
