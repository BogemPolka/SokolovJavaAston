package Task2;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = scan.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scan.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scan.close();
    }
}
