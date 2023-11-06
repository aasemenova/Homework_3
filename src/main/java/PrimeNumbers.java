import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = scanner.nextInt();

        boolean isPrime = true1;

        if (num <= 1) {
            System.out.println("Это число не является ни простым, ни составным");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Это число простое");
            } else {
                System.out.println("Это число составное");
            }
        }
    }
}