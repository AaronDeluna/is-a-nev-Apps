import management.AddTransaction;
import management.ShowTransaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] spendingName = new String[10];
        String[] incomeName = new String[10];

        int[] earnedMoney = new int[10];
        int[] spentMoney = new int[10];

        int counter = 0;

        String a = "1. Добавить транзакцию",
                b = "2. Посмотреть транзакции",
                c = "3. Удалить транзакцию",
                d = "4. Выйти из приложения";

        boolean flag = true;
        while (flag){
            System.out.printf("Выберите действие: \n%s \n%s \n%s \n%s \n", a, b, c, d);

            int userCommand = scanner.nextInt();
            if (userCommand >= 1 && userCommand <= 4) {
                switch (userCommand){
                    case 1 -> {
                        AddTransaction.addTransaction(spendingName, incomeName, earnedMoney, spentMoney, scanner, counter);
                        counter++;
                    }
                    case 2 -> ShowTransaction.showTransaction(spendingName, incomeName, earnedMoney, spentMoney, scanner);
                    case 4 -> {
                        System.out.println("пока!");
                        flag = false;
                    }
                }
            }else {
                System.out.println("Ошибка команды, повторите ввод!");
            }
        }

     }
}

//Динамический массив сделаем!
//Название траты, доход это или расход сумма тарты или дохода

//название масивов
//SpendingName - Название траты
//IncomeName - Название дохода
//(Трата) - мороженное - сумма: 20 Рб
//(Доход) - Подал машину - сумма: 30 Рб