package service.impl;

import model.Account;
import service.ApplicationService;
import service.EWalletSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {
    Scanner scanner = new Scanner(System.in);
    EWalletSystem E_wallet = new EWalletSystemImpl();
    Account account = new Account();

    @Override
    public void start() {
        System.out.println("-> Welcome to " + EWalletSystemImpl.name);
        int count = 0;

        while (true) {
            int choose;
            System.out.println("please choose......");
            System.out.println("1.login    2.signup     3.Exit");
            {
                boolean isExit = false;
                try {
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            account = E_wallet.Login();
                            if(account != null) showUserMenu();
                            else System.out.println("Account not found - signup");

                            break;

                        case 2:
                            E_wallet.Signup();
                            break;

                        case 3:
                            System.out.println("have a nice day :)");
                            isExit = true;
                            break;

                        default:
                            System.out.println("invalid choose :(");
                            count++;
                    }

                }
                catch (InputMismatchException e){

                    System.out.println("You must choose a number:(\n");
                    System.out.println("please choose......");
                    System.out.println("1.login    2.signup     3.Exit");
                    scanner.nextLine();
                    count++;
                }

                if (isExit) {
                    break;
                }

                if (count == 3) {
                    System.out.println("\npls contact with Admin :(\n");
                    break;
                }
            }
        }
    }

    @Override
    public void showUserMenu() {


        int count = 0;

        while (true) {
            int choose;
            System.out.println("========================================");
            System.out.println("                user menu");
            System.out.println("========================================");

            System.out.println("please choose......");
            System.out.println("1.Deposit    2.Withdraw     3.Transfer     4.Show balance\n" +
                    "5.Show account details     6.Change password     7.Logout");
            {
                boolean Logout = false;

                try {
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            System.out.println("=======");
                            System.out.println("Deposit");
                            System.out.println("=======");
                            E_wallet.deposit(account);

                            break;

                        case 2:
                            System.out.println("========");
                            System.out.println("Withdraw");
                            System.out.println("========");
                            E_wallet.withdraw(account);
                            break;

                        case 3:
                            System.out.println("========");
                            System.out.println("Transfer");
                            System.out.println("========");
                            E_wallet.transfer(account);
                            break;
                        case 4:
                            System.out.println("================");
                            System.out.println("Your balance is: "+E_wallet.showBalance(account));
                            System.out.println("================");
                            break;
                        case 5:
                            System.out.println("Show account details");
                            break;

                        case 6:
                            System.out.println("Change password");
                            break;

                        case 7:
                            System.out.println("have a nice day :)");
                            Logout = true;
                            break;

                        default:
                            System.out.println("invalid choose :(");
                            count++;
                    }

                }
                catch (InputMismatchException e){

                    System.out.println("You must choose a number :(\n");
                    System.out.println("please choose......");
                    System.out.println("1.Deposit    2.Withdraw     3.Transfer\n" +
                            "4.Show account details     5.Change password     6.Logout");
                    scanner.nextLine();
                    count++;
                }

                if (Logout) {
                    break;
                }

                if (count == 3) {
                    System.out.println("\npls contact with Admin :(\n");
                    break;
                }
            }
        }

    }
}