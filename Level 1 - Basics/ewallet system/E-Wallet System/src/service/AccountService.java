package service;

import model.Account;

public interface AccountService {

    // Signup validation
    String validateName(String name);

    String validatePassword(String password);

    String validateAge(int age);

    String validatePhoneNumber(String phoneNumber);

    void addAccount(Account account);


    // Login validation
    boolean checkIfNameNOTExist(String name);

    Account findAccount(String userName);

    Account authenticate(String name, String password);


    // user functionality
    public void deposit(double value, Account account);
    public void withdraw(double value, Account account);
}
