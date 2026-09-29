package service;

import model.Account;
import model.Wallet;

public interface AdminService {

    public void deleteAccount(Account account, Wallet wallet);

    public void inActiveAccount(Account account);

    public void activeAccount(Account account);
}
