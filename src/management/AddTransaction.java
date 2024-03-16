package management;

import java.util.Scanner;

public class AddTransaction {
    public static void addTransaction(String[] arraySpendingName, String[] arrayIncomeName, int[] arrayEarnedMoney, int[] arraySpentMoney, Scanner scanner, int counter){
        System.out.println("Выберите из: \n1 - доход \n2 - расход \n");
        int command = scanner.nextInt();

        if (command == 1){
            System.out.println("Введите название товара: ");
            String productName = scanner.next();
            System.out.println("Введите сумму: ");
            int productPrice = scanner.nextInt();
            arraySpendingName[counter] = productName;
            arraySpentMoney[counter] = productPrice;

        } else if (command == 2) {
            System.out.println("Введите название товара: ");
            String productSent = scanner.next();
            System.out.println("Введите сумму: ");
            int productPrice = scanner.nextInt();
            arrayIncomeName[counter] = productSent;
            arrayEarnedMoney[counter] = productPrice;
        }
    }
}
