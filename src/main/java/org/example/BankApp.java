package org.example;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w aplikacji bankowej BankApp");

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("0 - Koniec programu");
            System.out.println("1 - Dodaj transakcję");
            System.out.println("2 - Zmodyfikuj transakcję");
            System.out.println("3 - Wyświetl przychody / wydatki");
            System.out.println("4 - Usuń transakcję");

            String option = scanner.nextLine();
            switch (option) {
                case "0" -> {
                    BankDao bankDao = new BankDao();
                    bankDao.close();
                    return;
                }
                case "1" -> BankAddTransaction.main(new String[0]);
                case "2" -> BankModifyTransaction.main(new String[0]);
                case "3" -> BankShowTransactions.main(new String[0]);
                case "4" -> BankDeleteTransaction.main(new String[0]);
                default -> System.out.println("Nieprawidłowa opcja");
            }
        }
    }
}

