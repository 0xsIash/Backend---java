package service.impl;

import model.Account;
import service.AccountService;
import service.EWalletSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EWalletSystemImpl implements EWalletSystem {
    public final static String name = "EraaSoft Wallet";
    private final AccountService accountService = new AccountServiceImpl();

    Scanner scanner = new Scanner(System.in);


    public boolean Login() {

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
                return true;
            }

            System.out.println("Password doesn't match!");
            counter++;
        }

        System.out.println("\nYou have exceeded the maximum attempts.");
        System.out.println("Please contact with Admin :(\n");

        return false;
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
}
