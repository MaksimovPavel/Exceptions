package ExeptionsHW.HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        if (str.isEmpty() | str.isBlank()) throw new RuntimeException("Пустые строки вводить нельзя!");
        sc.close();
    }
}