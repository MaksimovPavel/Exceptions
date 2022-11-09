package ExeptionsHW.HW2;

public class Task3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        int[] abc = { 1, 2 };
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");             
        } catch (NullPointerException ex) {
            System.out.println("Задан массив null!");                        
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

