// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

package Seminar3;

import java.util.ArrayList;
import java.util.Random;

public class zadacha3 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        int n = rnd.nextInt(100);

        for (int i = 0; i < n; i++) {
            arr.add(rnd.nextInt(n));
            
        }
        System.out.println(arr);
        int min = arr.get(0);
        int max = arr.get(0);
        int sum = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min){            
                min = arr.get(i);               
            } else if (arr.get(i) > max) {
                max = arr.get(i);
            }
            sum += arr.get(i);
            
        }
        float srt = sum / n;
        System.out.printf("минимальное значение = %d , максимальное значение = %d , среднее арифметическое значение = %f , среднее значение = %d", min, max, srt, (min + max) / 2 );
        

    }
    
}
