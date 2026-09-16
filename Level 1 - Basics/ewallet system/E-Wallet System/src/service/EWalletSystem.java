package service;

import model.Account;

public interface EWalletSystem {
    public Account Login();
    public void Signup();
    public void deposit(Account account);
    public void withdraw(Account account);
    public void transfer(Account senderAccount);
    public double showBalance(Account account);
    public void showDetails(Account account);
}
