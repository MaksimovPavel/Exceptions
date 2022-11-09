package ExeptionsHW.HW2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Введите целое число: ");       
        int number = sc1.nextInt();                        
        System.out.println("Введите количество элементов массива");
        int size = sc2.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = rnd.nextInt(-10, 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        try {
            int result1 = array[8] / number;
            System.out.println("result1 = " + result1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
        sc1.close();
        sc2.close();
    }

} 

