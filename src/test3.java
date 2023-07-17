import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество сотрудников: ");
        int size = scanner.nextInt();
        Integer array[] = new Integer[size];
        System.out.println("Введите зарплату сотрудника:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Зарплата: ");
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp++;
            System.out.println(temp + ")" + " " + array[i]);
        }
        System.out.println("Нажмите 1 для сортировки по возрастанию\n" +
                "Нажмите 2 для сортировки по убыванию");
        int n = scanner.nextInt();
        int tmp = 0;
        switch (n) {
            case 1: {
                Arrays.sort(array);
                for (int values : array) {
                    tmp++;
                    System.out.println(tmp + ")" + " " + values);
                }
            }
            case 2: {
                Arrays.sort(array, Collections.reverseOrder());
                for (int values : array) {
                    tmp++;
                    System.out.println(tmp + ")" + " " + values);
                }
            }
        }
    }
}



