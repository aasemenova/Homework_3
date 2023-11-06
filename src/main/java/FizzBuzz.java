public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Число " + i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Число " + i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Число " + i + " - Buzz");
            } else {
                System.out.println("Число " + i + " не делится на 3 или на 5 без остатка");
            }
        }
    }
}