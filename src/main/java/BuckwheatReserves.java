import java.util.Scanner;

public class BuckwheatReserves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("В течение какого срока вы хотите питаться гречкой?");
        int month = scanner.nextInt();

        int pricePerKg = 100;
        int totalCost = 0;
        int buckwheatReserve = month * 6;

        for (int i = 1; i <= month; i++) {
            int monthlyCost = pricePerKg * buckwheatReserve;
            totalCost += monthlyCost;
            buckwheatReserve -= 6;

            System.out.println("Стоимость хранения за " + i + " месяц: " + monthlyCost + " руб., остаток гречки: " + buckwheatReserve + " кг");
        }
        System.out.println("Общая стоимость хранения гречки: " + totalCost + " руб.");
    }
}