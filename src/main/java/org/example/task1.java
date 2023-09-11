package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr.get(i)>max && arr.get(i)<=s){
                max=arr.get(i);
            }
        }
        System.out.println(max);
    }
}