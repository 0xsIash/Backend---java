package service.impl;

import model.Account;
import model.Wallet;
import service.AccountService;

import java.util.Objects;
import java.util.function.Predicate;

public class AccountServiceImpl implements AccountService {

    private final Wallet wallet = new Wallet();

    // Signup validation
    public String validateName(String name){
        if(name.length() < 3){
            return "Name must be at least 3 characters long.";
        }
        if(name.charAt(0) < 'A' || name.charAt(0) > 'Z'){
            return "First character must be uppercase.";
        }

        Predicate<Account> checkName = n -> Objects.equals(n.getUserName(), name);
        if(wallet.getAccounts().stream().anyMatch(checkName)){
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

        Predicate<Account> checkPhoneNumber =
                n -> Objects.equals(n.getPhoneNumber(), phoneNumber);

        if (wallet.getAccounts().stream().anyMatch(checkPhoneNumber)) {
            return "Phone number already exists.";
        }

        return "valid";
    }

    public void addAccount(Account account) {

        wallet.getAccounts().add(account);
        System.out.println("Account has been added successfully :)");
    }


    // Login validation
    public boolean checkIfNameNOTExist(String name){


        Predicate<Account> checkName = n -> Objects.equals(n.getUserName(), name);
        return wallet.getAccounts().stream().noneMatch(checkName);

    }

    public Account findAccount(String userName){

        return wallet.getAccounts().stream().filter(n->n.getUserName().equals(userName))
                .findAny()
                .orElse(null);
    }

    public Account authenticate(String name, String password) {

        Account account = findAccount(name);

        if (account.getPassword().equals(password)) {
            return account;
        }

        return null;
    }

}
