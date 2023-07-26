package org.example;

import java.util.Scanner;

public class BankShowTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userOption = null;
        System.out.println("Jakie transakcje chcesz wyświetlić?");
        System.out.println("1 - przychody");
        System.out.println("2 - wydatki");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> {
                userOption = "przychód";
                BankDao bankDao = new BankDao();
                bankDao.show(userOption);

            }
            case "2" -> {
                userOption = "wydatek";
                BankDao bankDao = new BankDao();
                bankDao.show(userOption);
            }
            default -> System.out.println("Nieprawidłowa opcja");
        }
    }

}

