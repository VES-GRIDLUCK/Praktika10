import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < 6; j++) {
            Arrays.sort(arr);
            for (int values : arr) {
                System.out.print(values + " ");
            }
        }
        System.out.println();
        for (int c = 7; c < 15; c++) {
            Arrays.sort(arr, Collections.reverseOrder());
            for (int values : arr) {
                System.out.print(values + " ");
            }
        }

        System.out.println();
    }
}

