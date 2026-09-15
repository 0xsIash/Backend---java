package service;

import model.Account;

public interface EWalletSystem {
    public Account Login();
    public void Signup();
    public void deposit(Account account);

}
