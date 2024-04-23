import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {50, 14, 80};

        int[] cart = new int[products.length];
        int sumProducts = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            cart[productNumber] += productCount;

            sumProducts += prices[productNumber] * productCount;
        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++) {
            if (cart[i] > 0) {
                System.out.println(products[i] + " " + cart[i] + " шт " + prices[i] + " руб/шт " + cart[i] * prices[i] + " руб в сумме");
            }
        }
        System.out.println("Итого " + sumProducts + " руб");
    }
}