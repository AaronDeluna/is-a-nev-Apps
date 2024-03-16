package management;

import java.util.Scanner;

public class ShowTransaction {
    public static void showTransaction(String[] arraySpendingName, String[] arrayIncomeName, int[] arrayEarnedMoney, int[] arraySpentMoney, Scanner scanner){
        boolean isEmty = true;
        for (int i = 0; i < arraySpendingName.length; i++) {
            if (arraySpendingName[i] != null && arraySpentMoney[i] != 0){
                String productName = arraySpendingName[i];
                System.out.println("\n" + productName);
                isEmty = false;
            }

            if (isEmty){
                System.out.println("Список пуст!");
                break;
            }
        }
    }
}
