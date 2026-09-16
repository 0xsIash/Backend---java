package service.impl;

import model.Account;
import service.AccountService;
import service.EWalletSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EWalletSystemImpl implements EWalletSystem {
    public final static String name = "EraaSoft Wallet";
    private final AccountService accountService = new AccountServiceImpl();
    int value=0;

    Scanner scanner = new Scanner(System.in);


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
            String password = scanner.nextLine();

            Account account = accountService.authenticate(name, password);

            if (account != null) {
                System.out.println("Logged in successfully :)");
                return accountService.findAccount(name);
            }

            System.out.println("Password doesn't match!");
            counter++;
        }

        System.out.println("\nYou have exceeded the maximum attempts.");
        System.out.println("Please contact with Admin :(\n");

        return null;
    }

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

            String result = accountService.validateName(userName);

            if (result.equals("valid")) {
                break;
            }

            System.out.println(result);
            counter++;
        }

        while (counter < 3) {

            System.out.print("Enter your password: ");
            password = scanner.nextLine();

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

    public void deposit(Account account){
            try{
                System.out.print("Enter value: ");
                value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Invalid value. Must be grater than zero");
                }

                else {
                    accountService.deposit(value, account);
                    System.out.println("operation has been done successfully :)");
                    System.out.println("your current balance is: "+account.getBalance());
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid value. Must be grater than zero");
                scanner.nextLine();
            }

    }

    public void withdraw(Account account){
            try{
                System.out.print("Enter value: ");
                value = scanner.nextInt();

                if (value <= 0) {
                    System.out.println("Invalid value. Must be grater than zero");
                }

                else if(account.getBalance() == 0 || account.getBalance()<value){
                    System.out.println("Your current balance doesn't enough.");
                    System.out.println("your current balance is: "+account.getBalance());
                }

                else {
                    accountService.withdraw(value, account);
                    System.out.println("operation has been done successfully :)");
                    System.out.println("your current balance is: "+account.getBalance());
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid value. Must be grater than zero");
                scanner.nextLine();
            }

    }

    public void transfer(Account senderAccount){
        scanner.nextLine();
        System.out.print("Enter receiver username: ");
        String userName = scanner.nextLine();
        // check if receiver username is existed
        boolean isExist = !accountService.checkIfNameNOTExist(userName);
        if(isExist){
            Account receiverAccount = accountService.findAccount(userName);
            withdraw(senderAccount);
            accountService.deposit(value,receiverAccount);
        }
        else {
            System.out.println("User can't be found!");
        }


    }

    public double showBalance(Account account){
        return account.getBalance();
    }

    public void showDetails(Account account){
        System.out.println("|---------------------------|");
        System.out.println("|Name: "+account.getUserName()+"\t\t\t\t    |");
        System.out.println("|Phone Number: "+account.getPhoneNumber()+"  |");
        System.out.println("|Balance: "+account.getBalance()+"\t\t\t    |");
        System.out.println("|Age: "+account.getAge()+"\t\t\t\t    |");
        System.out.println("|---------------------------|");
    }
}
