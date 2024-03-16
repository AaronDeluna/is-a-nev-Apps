package management;

import java.util.Scanner;

public class ShowTransaction {
    public static void showTransaction(String[] arraySpendingName, String[] arrayIncomeName, int[] arrayEarnedMoney, int[] arraySpentMoney, Scanner scanner){

        String a = "1. Посмотреть всё",
                b = "2. Посмотреть расходы",
                c = "3. Посмотреть доходы",
                d = "4. Выйти";


        System.out.printf("Выберите вариант: \n%s \n%s \n%s \n%s \n", a, b, c, d);
        int command = scanner.nextInt();
        switch (command){
            case 1 -> showAllTransaction();
            case 2 -> showSpending(arraySpendingName, arraySpentMoney);
            case 3 -> showIncome(arrayIncomeName, arrayEarnedMoney);
            case 4 -> System.out.println("Вы вышли из меню!");
        }
    }

    public static void showAllTransaction(){

    }

    public static void showSpending(String[] arraySpending, int[] arraySpent){
        for (int i = 0; i < arraySpending.length; i++) {
            boolean isEmpty = true;
            if (arraySpending[i] != null && arraySpent[i] != 0) {
                String productName = arraySpending[i];
                int productPrice = arraySpent[i];
                System.out.println("(Трата) - " + productName + " - Сумма: " + productPrice);
                isEmpty = false;
            }

            if (isEmpty){
                System.out.println("Список пуст!");
                break;
            }
        }
    }


    public static void showIncome(String[] arrayIncome, int[] arrayEarned){
        for (int i = 0; i < arrayIncome.length; i++) {
            boolean isEmpty = true;
            if (arrayIncome[i] != null && arrayEarned[i] != 0){
                String productName = arrayIncome[i];
                int productPrice = arrayEarned[i];
                System.out.println("(Заработок) - " + productName + " - Сумма: " + productPrice);
                isEmpty = false;
            }

            if (isEmpty){
                System.out.println("Список пуст!");
                break;
            }
        }
    }
}