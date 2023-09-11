package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] djo = new int[n];
        int[] win = new int[n];
        for (int i = 0; i < n; i++) {
            djo[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            win[i] = scanner.nextInt();
        }
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {


                int[] copy = djo.clone();

                Arrays.sort(copy, i, j);


                if (Arrays.equals(copy, win) || Arrays.equals(djo, win)) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
