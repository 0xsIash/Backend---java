package service.impl;

import model.Account;
import model.Wallet;
import service.AdminService;

public class AdminServiceImpl implements AdminService {

    @Override
    public void deleteAccount(Account account, Wallet wallet) {
        wallet.getAccounts().remove(account);
    }

    @Override
    public void inActiveAccount(Account account) {
        account.setActive(false);
    }

    @Override
    public void activeAccount(Account account) {
        account.setActive(true);
    }
}
