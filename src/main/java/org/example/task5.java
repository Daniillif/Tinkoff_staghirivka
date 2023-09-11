package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();//города
        int m = scanner.nextInt();//дороги
        int[] [] arr = new int[m][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

    }
}
