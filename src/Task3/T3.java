package Task3;

public class T3 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа в массиве:");
        for (int n : num) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
