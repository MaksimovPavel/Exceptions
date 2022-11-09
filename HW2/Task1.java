package ExeptionsHW.HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getRealNumber());
    }

    public static float getRealNumber() {
        boolean check = true;
        float number = 0;

        while (check) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите вещественное число: ");
                number = sc.nextFloat();
                check = false;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение!");
            }
        }
        return  number;
    }
}

