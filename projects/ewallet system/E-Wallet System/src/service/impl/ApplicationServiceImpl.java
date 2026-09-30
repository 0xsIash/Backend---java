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

            System.out.println("========================================");
            System.out.println("              Main Menu");
            System.out.println("========================================");

            System.out.println("please choose......");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Exit");

            try {

                choose = scanner.nextInt();

                switch (choose) {

                    case 1:

                        showUserLoginMenu();
                        break;

                    case 2:

                        showAdminLoginMenu();
                        break;

                    case 3:

                        System.out.println("have a nice day :)");
                        return;

                    default:

                        System.out.println("invalid choose :(");
                        count++;
                }

            } catch (InputMismatchException e) {

                scanner.nextLine();
                System.out.println("You must choose a number :(\n");
                count++;
            }

            if (count == 3) {

                System.out.println("\npls contact with Admin :(\n");
                return;
            }
        }
    }


    private void showUserLoginMenu() {

        int count = 0;

        while (true) {

            int choose;

            System.out.println("========================================");
            System.out.println("                User");
            System.out.println("========================================");

            System.out.println("please choose......");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Return to main menu");

            try {

                choose = scanner.nextInt();

                switch (choose) {

                    case 1:

                        account = E_wallet.Login();

                        if (account != null) {
                            showUserMenu();
                        }

                        break;


                    case 2:

                        E_wallet.Signup();
                        break;


                    case 3:

                        // Return to Main Menu
                        return;


                    default:

                        System.out.println("invalid choose :(");
                        count++;
                }

            } catch (InputMismatchException e) {

                scanner.nextLine();
                System.out.println("You must choose a number :(\n");
                count++;
            }

            if (count == 3) {

                System.out.println("\npls contact with Admin :(\n");
                return;
            }
        }
    }


    private void showAdminLoginMenu() {

        int count = 0;
        System.out.println("========================================");
        System.out.println("              Admin Login");
        System.out.println("========================================");

        while (true) {

            try {

                if (E_wallet.adminLogin()) {

                    // Login successful
                    showAdminMenu();
                    return;
                } else {

                    System.out.println("Invalid Admin username or password :(");
                    count++;
                }

            } catch (InputMismatchException e) {

                scanner.nextLine();
                System.out.println("Invalid input :(\n");
                count++;
            }

            if (count == 3) {

                System.out.println("You end of trials. Please try again.");
                return;
            }

            if (count == 0) {
                return;
            }
        }
    }


    private void showAdminMenu() {

        int count = 0;

        while (true) {

            int choose;

            System.out.println("========================================");
            System.out.println("              Admin Menu");
            System.out.println("========================================");

            System.out.println("please choose......");

            System.out.println("1. Active Account");
            System.out.println("2. Inactive Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Logout");

            try {

                choose = scanner.nextInt();

                switch (choose) {

                    case 1:

                        System.out.println("================");
                        System.out.println("Active Account");
                        System.out.println("================");

                        // Active Account
                        E_wallet.activeUser();

                        break;


                    case 2:

                        System.out.println("==================");
                        System.out.println("Inactive Account");
                        System.out.println("==================");

                        // Inactive Account
                        E_wallet.inActiveUser();

                        break;


                    case 3:

                        System.out.println("================");
                        System.out.println("Delete Account");
                        System.out.println("================");

                        // Delete Account
                        E_wallet.deleteUser();

                        break;


                    case 4:

                        System.out.println("have a nice day :)");
                        return;


                    default:

                        System.out.println("invalid choose :(");
                        count++;
                }

            } catch (InputMismatchException e) {

                scanner.nextLine();
                System.out.println("You must choose a number :(\n");
                count++;
            }

            if (count == 3) {

                System.out.println("\npls contact with Admin :(\n");
                return;
            }
        }
    }


    @Override
    public void showUserMenu() {

        int count = 0;

        while (true) {

            int choose;

            System.out.println("========================================");
            System.out.println("                User Menu");
            System.out.println("========================================");

            System.out.println("please choose......");

            System.out.println(
                    "1.Deposit    2.Withdraw     3.Transfer     4.Show balance\n" +
                            "5.Show account details     6.Change password     7.History     8.Logout"
            );

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

                        System.out.println("=====================");

                        System.out.println(
                                "Your balance is: "
                                        + E_wallet.showBalance(account)
                        );

                        System.out.println("=====================");

                        break;


                    case 5:

                        System.out.println("Account Details");

                        E_wallet.showDetails(account);

                        break;


                    case 6:

                        System.out.println("================");
                        System.out.println("Change password");
                        System.out.println("================");

                        E_wallet.changePassword(account);

                        break;

                    case 7:
                        System.out.println("================");
                        System.out.println("  User History  ");
                        System.out.println("================");

                        E_wallet.showHistory(account);
                        break;


                    case 8:

                        System.out.println("have a nice day :)");
                        return;


                    default:

                        System.out.println("invalid choose :(");
                        count++;
                }

            } catch (InputMismatchException e) {

                scanner.nextLine();
                System.out.println("You must choose a number :(\n");
                count++;
            }

            if (count == 3) {

                System.out.println("\npls contact with Admin :(\n");
                return;
            }
        }
    }
}