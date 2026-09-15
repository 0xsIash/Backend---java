package service;

import model.Account;

public interface AccountService {
    String validateName(String name);

    String validatePassword(String password);

    String validateAge(int age);

    String validatePhoneNumber(String phoneNumber);

    void addAccount(Account account);

    boolean checkIfNameNOTExist(String name);

    Account findAccount(String userName);

    Account authenticate(String name, String password);
}
