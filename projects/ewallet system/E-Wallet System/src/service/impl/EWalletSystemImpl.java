package service.impl;
import model.Account;
import model.Admin;
import model.Wallet;
import service.AccountService;
import service.AdminService;
import service.EWalletSystem;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class EWalletSystemImpl implements EWalletSystem {
    public final static String name = "EraaSoft Wallet";
    private final AccountService accountService = new AccountServiceImpl();
    private final AdminService adminService = new AdminServiceImpl();
    private final Admin admin = new Admin();

    int value=0;

    Scanner scanner = new Scanner(System.in);


    @Override
    public Account Login() {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 3) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Username can't be empty!");
                counter++;
                continue;
            }

            if (accountService.checkIfNameNOTExist(name)) {
                System.out.println("Username can't be found!");
                counter++;
                continue;
            }

            System.out.print("Enter your password: ");
            String password = scanner.next();

            Account account = accountService.authenticate(name, password);

            if (account == null) {
                System.out.println("Password doesn't match!");
                counter++;
                continue;
            }

            if (!account.isActive()) {
                System.out.println("Your account isn't active. contact admin");
                return null;
            }

            System.out.println("Logged in successfully :)");
            return account;
        }

        System.out.println("\nYou have exceeded the maximum attempts.");
        System.out.println("Please contact with Admin :(\n");

        return null;
    }


    @Override
    public void Signup(){
        int counter = 0;

        String userName = "";
        String password = "";
        int age = 0;
        String phoneNumber = "";

        System.out.println("signup feature");
        System.out.println("------------------");
        while (counter < 3) {

            System.out.print("Enter your name: ");
            userName = scanner.nextLine();

            if(userName.equals("IAM")){
                System.out.println("username is already taken");
            }

            else {
                String result = accountService.validateName(userName);

                if (result.equals("valid")) {
                    break;
                }

                System.out.println(result);
            }
            counter++;
        }

        while (counter < 3) {

            System.out.print("Enter your password: ");
            password = scanner.next();

            String result = accountService.validatePassword(password);

            if (result.equals("valid")) {
                break;
            }

            System.out.println(result);
            counter++;
        }


        while (counter < 3) {

            System.out.print("Enter your age: ");

            try {
                age = scanner.nextInt();

                String result = accountService.validateAge(age);

                if (result.equals("valid")) {
                    break;
                }

                System.out.println(result);
                counter++;

            } catch (InputMismatchException e) {
                System.out.println("Invalid age, please enter numbers only.");
                scanner.nextLine();
                counter++;
            }
        }

        while (counter < 3) {

            System.out.print("Enter your phone number: ");
            phoneNumber = scanner.next();

            String result = accountService.validatePhoneNumber(phoneNumber);

            if (result.equals("valid")) {
                break;
            }

            System.out.println(result);
            counter++;
        }


        if (counter < 3){
            Account account = new Account(userName, password, age, phoneNumber);
            accountService.addAccount(account);
        }
        else {
            System.out.println("\npls contact with Admin :(\n");
        }
    }


    @Override
    public void deposit(Account account){
        if(accountService.checkIfNameNOTExist(account.getUserName())){
            System.out.println("Account doesn't exist");
        }
        else{
            try {
                System.out.print("Enter value: ");
                value = scanner.nextInt();
                if (value <= 100) {
                    System.out.println("Invalid value. Must be grater than 100");
                } else if(value>12000){
                    System.out.println("Invalid value. Maximum value is 12000");
                }
                else {
                    accountService.deposit(value, account);
                    System.out.println("operation has been done successfully :)");
                    System.out.println("your current balance is: " + account.getBalance());
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid value. Must be grater than 100");
                scanner.nextLine();
            }
        }

    }


    @Override
    public void withdraw(Account account){
        if(accountService.checkIfNameNOTExist(account.getUserName())){
            System.out.println("Account doesn't exist");
        }
        else {
            try {
                System.out.print("Enter value: ");
                value = scanner.nextInt();

                if (value <= 0 || value > 4000) {
                    System.out.println("Invalid value. Must be > 0 and < 4000");
                } else if (account.getBalance() == 0 || account.getBalance() < value) {
                    System.out.println("Your current balance doesn't enough.");
                    System.out.println("your current balance is: " + account.getBalance());
                } else {
                    accountService.withdraw(value, account);
                    System.out.println("operation has been done successfully :)");
                    System.out.println("your current balance is: " + account.getBalance());
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid value. Must be > 0 and < 4000");
                scanner.nextLine();
            }
        }

    }


    @Override
    public void transfer(Account senderAccount){
        scanner.nextLine();
        System.out.print("Enter receiver username: ");
        String userName = scanner.nextLine();

        boolean isExist = !accountService.checkIfNameNOTExist(userName);

        // check if user transfer money to himself
        if(Objects.equals(userName, senderAccount.getUserName())){
            System.out.println("can't transfer money to yourself!");
        }

        // check if receiver username is existed
        else if(isExist){
            Account receiverAccount = accountService.findAccount(userName);

            // transfer money from sender account
            try{
                System.out.print("Enter value: ");
                value = scanner.nextInt();

                if (value <= 0 || value > 4000) {
                    System.out.println("Invalid value. Must be > 0 and < 4000");
                }

                else if(senderAccount.getBalance() == 0 || senderAccount.getBalance()<value){
                    System.out.println("Your current balance doesn't enough.");
                    System.out.println("your current balance is: "+senderAccount.getBalance());
                }

                else {
                    accountService.withdraw(value, senderAccount);
                    accountService.deposit(value,receiverAccount);
                    System.out.println("operation has been done successfully :)");
                    System.out.println("your current balance is: "+senderAccount.getBalance());
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid value. Must be > 0 and < 4000");
                scanner.nextLine();
            }
        }
        else {
            System.out.println("User can't be found!");
        }
    }


    @Override
    public double showBalance(Account account){
        if(accountService.checkIfNameNOTExist(account.getUserName())){
            System.out.println("Account doesn't exist");
            return 0;
        }
        return account.getBalance();
    }


    @Override
    public void showDetails(Account account){
        if(accountService.checkIfNameNOTExist(account.getUserName())){
            System.out.println("Account doesn't exist");
        }
        else {
            System.out.println("|---------------------------|");
            System.out.println("|Name: " + account.getUserName() + "\t\t\t\t    |");
            System.out.println("|Phone Number: " + account.getPhoneNumber() + "  |");
            System.out.println("|Balance: " + account.getBalance() + "\t\t\t    |");
            System.out.println("|Age: " + account.getAge() + "\t\t\t\t    |");
            System.out.println("|---------------------------|");
        }
    }


    @Override
    public void changePassword(Account account){
        if(accountService.checkIfNameNOTExist(account.getUserName())){
            System.out.println("Account doesn't exist");
        }
        else {
            System.out.print("Enter old password: ");
            String oldPassword = scanner.next();

            boolean isMatched = oldPassword.equals(account.getPassword());

            if (isMatched) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.next();
                System.out.print("Confirm password: ");
                String confPass = scanner.next();

                boolean isConfirmed = newPassword.equals(confPass);

                if (oldPassword.equals(newPassword)) {
                    System.out.println("It's the same old password!");
                } else if (isConfirmed) {
                    account.setPassword(newPassword);
                    System.out.println("Password changed successfully :)");
                } else {
                    System.out.println("Password doesn't match");
                }
            } else {
                System.out.println("Password isn't correct");
            }
        }
    }

    @Override
    public boolean adminLogin() {
            System.out.print("Enter Username: ");
            String name = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

                return name.equals(admin.getUserName()) && password.equals(admin.getPassword());
    }

    @Override
    public void inActiveUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        Account account = accountService.findAccount(username);
        if(account != null){
            adminService.inActiveAccount(account);
            System.out.println("Account is deactivated successfully");
        }
        else {
            System.out.println("Account not found");
        }
    }

    @Override
    public void activeUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        Account account = accountService.findAccount(username);
        if(account != null){
            adminService.activeAccount(account);
            System.out.println("Account is activated successfully");
        }
        else {
            System.out.println("Account not found");
        }
    }

    @Override
    public void deleteUser(){
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        Account account = accountService.findAccount(username);
        if(account != null){
            adminService.deleteAccount(account, accountService.getWallet());
            System.out.println("Account is deleted successfully");
        }
        else {
            System.out.println("Account not found");
        }
    }
}