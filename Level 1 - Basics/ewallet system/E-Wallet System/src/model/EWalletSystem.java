package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EWalletSystem {
    private final Wallet wallet;
    public final static String name = "EraaSoft Wallet";

    public EWalletSystem() {
        wallet = new Wallet();
    }
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

            if (wallet.checkIfNameNOTExist(name)) {
                System.out.println("Username can't be found!");
                counter++;
                continue;
            }

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            User user = wallet.authenticate(name, password);

            if (user != null) {
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
            userName = scanner.next();

            String result = wallet.validateName(userName);

            if (result.equals("valid")) {
                break;
            }

            System.out.println(result);
            counter++;
        }

        while (counter < 3) {

            System.out.print("Enter your password: ");
            password = scanner.next();

            String result = wallet.validatePassword(password);

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

                String result = wallet.validateAge(age);

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

            String result = wallet.validatePhoneNumber(phoneNumber);

            if (result.equals("valid")) {
                break;
            }

            System.out.println(result);
            counter++;
        }


        if (counter < 3){
            User user = new User(userName, password, age, phoneNumber);
            wallet.addUser(user);
        }
        else {
            System.out.println("\npls contact with Admin :(\n");
        }
    }
}
