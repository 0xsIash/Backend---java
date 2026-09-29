package service;

import model.Account;
import model.Wallet;

public interface AccountService {

    public Wallet getWallet();

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
    public void transfer(double value, Account senderAccount, Account reciverAccount);
    public void changePassword(String newPassword, Account account);
}
