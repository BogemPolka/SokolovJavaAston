package Task1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);

        scan.close();
    }
}