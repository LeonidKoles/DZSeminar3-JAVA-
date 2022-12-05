// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Seminar3;


import java.util.ArrayList;
import java.util.Random;

public class zadacha2 {
    
    public static void main(String[] args) {
        ArrayList <Integer> lst = new ArrayList<>();
        Random rnd = new Random();

        int n = rnd.nextInt(100);

        for (int i = 0; i < n; i++) {

            lst.add(rnd.nextInt(n));
            
        }
        System.out.println(lst);
        ArrayList <Integer> res = new ArrayList<>();

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2  == 1){
                res.add(lst.get(i));
                
            }
            
        }
        System.out.println(res);
    }
}
