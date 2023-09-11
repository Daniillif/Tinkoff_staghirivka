package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//Сколько нужно ДЖО например 5 баксов
        int m = scanner.nextInt();//Сколько всего номиналов неизвестно какие  например всего 2 номинала(1 и 2 бакса)
        int[] arr = new int[m];//какие именно номиналы(тут уже конкретика 1 и 2 бакса) заранее известно что всего 2 купюры каждого номинала
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean flag = false;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        int summ=0;
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                summ+=arr[j];
                count++;
                result.add(arr[j]);
                if(summ==n){
                    flag=true;
                    System.out.println(count);
                    Collections.sort(result);
                    for (int k = 0; k < result.size()-1; k++) {
                        System.out.print(result.get(k) + " ");
                    }
                    System.out.println(result.get(result.size()-1));
                }
            }

        }
        summ=0;
        count=0;
        for (int i = m-1; i >=0; i--) {
            for (int j = m-1; j >=0; j--) {
                summ+=arr[j];
                count++;
                result2.add(arr[j]);
                if(summ==n){
                    flag=true;
                    System.out.println(count);
                    Collections.sort(result2);
                    for (int k = 0; k < result2.size()-1; k++) {
                        System.out.print(result2.get(k) + " ");
                    }
                    System.out.println(result2.get(result2.size()-1));
                }
            }

        }

        if (!flag){
            System.out.println(-1);
        }


    }
}
