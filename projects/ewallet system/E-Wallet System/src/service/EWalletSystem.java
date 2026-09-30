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
    public void changePassword(Account account);

    public boolean adminLogin();
    public void inActiveUser();
    public void activeUser();
    public void deleteUser();

    public void showHistory(Account account);
}
