/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author recber
 */
public class Del15 {

    public static void main(String[] args) {
//        System.out.println(sum(555));
        List<Integer> l15 = new ArrayList<>();
        for (int k = 100; k < 1000; k++) {
            if ((k % 15) == 0 && (sum(k) % 15) == 0) {
                l15.add(k);
            }
        }
        Iterator<Integer> iter = l15.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
    }

    public static int sum(int arg) {
        int sum = 0;
        while (arg != 0) {
            //Суммирование цифр числа
            sum = sum + (arg % 10);
            arg = arg / 10;
        }
//        System.out.println(sum + " ");
        return sum;
    }
}

class TestPlus {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.print("Bвод натурального числа - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        while (n != 0) {
            //Суммирование цифр числа
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println(sum + " ");
    }
}

class D15 {

    public static void main(String[] args) {
//        for (int k = 100; k < 1000; k++) {
//            System.out.println("INT : " + k + " SUM -> " + sum(k));
//        }

//        for (int s = 100; s < 1000; s++) {
//            if (sum(s) == 15) {
//                System.out.println("INT : " + s + " SUM -> " + sum(s));
//            }
//        }
        
//        for (int i = 100; i < 1000; i++) {
//            if ((sum(i) == 15) && (i % 15)==0) {
//                System.out.println("INT : " + i + " SUM -> " + sum(i));
//            }
//        }
        
        for (int i = 100; i < 1000; i++) {
            if ((i % 15)==0 && (sum(i) == 15)) {
                System.out.println("INT : " + i + " SUM -> " + sum(i));
            }
        }
    }

    public static int sum(int arg) {
        int sum = 0;
        while (arg != 0) {
            //Суммирование цифр числа
            sum = sum + (arg % 10);
            arg = arg / 10;
        }
        return sum;
    }
}
