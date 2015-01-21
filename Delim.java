/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Evrica;

import java.util.Scanner;

/**
 *
 * @author recber
 */
public class Delim {
     public static void main (String args[]) {
    int barer ;
    int FirstNumber1 ;
    int SecondNumber1 ;
    int PlusNumber;
    int carve;
    Scanner in1 = new Scanner(System.in);
    System.out.println("Введите до какого числи будем искать");
    barer = in1.nextInt();
    System.out.println("Ведите первое число b выражения ba+c");
    FirstNumber1 = in1.nextInt();
//    System.out.println("Ведите первое число a выражения ba+c");
//    SecondNumber1 = in1.nextInt();
    System.out.println("Ведите первое число c выражения ba+c");
    PlusNumber = in1.nextInt();
    System.out.println("Ведите первое число на которое делим");
    carve = in1.nextInt();
    for (barer = 1; barer < barer+1; barer++){
        int k = (FirstNumber1 * barer) + PlusNumber;
            if ((k % carve) ==0 ){
          System.out.print(k + " ");
        }
      }
}
}


