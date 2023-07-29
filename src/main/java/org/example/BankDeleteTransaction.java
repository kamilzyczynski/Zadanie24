package org.example;

import java.util.Scanner;

public class BankDeleteTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID transakcji, którą chcesz usunąć");
        long id = scanner.nextLong();
        BankDao bankDao = new BankDao();
        bankDao.delete(id);
    }
}
