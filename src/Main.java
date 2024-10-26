import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] money = {250, 500, 750, 1000, 1250};
        int expense = 0;
        for (int payment : money) {
            expense += payment;
        }
        System.out.println("Сумма трат за месяц составила " + expense + " рублей.");
        System.out.println("Задание 2");
        int[] money1 = {10000, 15000, 20000, 25000, 30000};
        int maxExpense1 = 10;
        for (int i = 0; i < money1.length; i++) {
            if (money1[i] > maxExpense1) {
                maxExpense1 = money1[i];
            }
        }
        int[] money2 = {10000, 15000, 20000, 25000, 30000};
        int minExpense = 10000;
        for (int i = 0; i > money2.length; i++) {
            if (money2[i] > minExpense) {
                minExpense = money2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense1 + " рублей.");
        System.out.println("Задание 3");
        int[] money3 = {250, 500, 750, 1000, 1250};
        int week = 5;
        int expense1 = 0;
        double avg = 0;
        for (int payment1 : money3) {
            expense1 += payment1;
        }
        avg = expense1 / week;
        System.out.println(avg);
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i2 = 0; i2 < reverseFullName.length /2; i2++) {
            char temp = reverseFullName[i2];
            reverseFullName[i2] = reverseFullName[reverseFullName.length - 1 - i2];
            reverseFullName[reverseFullName.length - 1 - i2] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}