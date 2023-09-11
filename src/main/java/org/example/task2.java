package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] arr = s.toCharArray();

        Map<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }

        int count = 0;
        try{for (int i = 0; i < map.get('s'); i++) {
            if(map.get('s')>=1 && map.get('h')>=1 && map.get('e')>=1 && map.get('r')>=1 && map.get('i')>=1 && map.get('f')>=2){
                count++;
                map.put('s', map.get('s')-1);
                map.put('s', map.get('h')-1);
                map.put('s', map.get('e')-1);
                map.put('s', map.get('r')-1);
                map.put('s', map.get('i')-1);
                map.put('s', map.get('f')-2);
            }
            else
                break;
        }
        System.out.println(count);
    }catch (NullPointerException e){
            System.out.println(0);
        }
    }


}
