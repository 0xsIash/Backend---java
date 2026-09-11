package service.impl;

import model.EWalletSystem;
import service.ApplicationService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Welcome to " + EWalletSystem.name);
        EWalletSystem E_wallet = new EWalletSystem();

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
                            System.out.println("login feature");
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

                    System.out.println("invalid choose :(\n");
                    System.out.println("please choose......");
                    System.out.println("1.login    2.signup     3.Exit");
                    scanner.nextLine();
                    count++;
                }

                if (isExit) {
                    break;
                }

                if (count == 4) {
                    System.out.println("pls contact with Admin :(");
                    break;
                }
            }
        }
    }

}