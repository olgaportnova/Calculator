import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static String price;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println ("На скольких человек необходимо разделить счет?");
            int x;
            while (true) {

                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    scanner.nextLine();
                }
                else {
                    System.out.println("Введите число!");
                    scanner.nextLine();
                    continue;
                }
                if (x == 1) {
                    System.out.println("Ошибка, на одного человека не поделить! Введите заново!");
                }
                if (x < 1) {
                    System.out.println("Введите число больше 1.");
                }
                if (x>1) {
                    break;
                }
            }



        Calculator calculator1 = new Calculator(0, "");
        while (true) {
            System.out.println("Введите название товара.");
            String itemName = scanner.next();
            scanner.nextLine();
            double itemPrice=0d;
            while (true){
                System.out.println("Введите цену товара в формате 'рубли.копейки' [10.45, 11.40].");
                if (scanner.hasNextDouble()) {
                    itemPrice = scanner.nextDouble();
                    scanner.nextLine();
                    if (itemPrice>=0){
                        break;
                    }

                }
                else {
                    scanner.nextLine();
                    continue;

                }


            }
            Item item = new Item(itemName, itemPrice);
            calculator1.sum(item);
            System.out.println("Товар добавлен в корзину. Если хотите завершить - напишите 'завершить', если продолжить - любой символ.");
            String end = scanner.next();
            end=end.toLowerCase();
            if (end.equalsIgnoreCase("завершить")) {
                break;
            }
        }
        double pricePerPerson = calculator1.calculatorSumm / x;
        String pricePerPersonToShow = String.format("%.2f", pricePerPerson);
        Rubles pron = new Rubles (pricePerPerson);

        String pronanc=pron.rubles(pricePerPerson);
        System.out.println( "Все добавленные товары:" +  calculator1.calculatorItemList);
        System.out.println("Каждый человек должен заплатить: " + pricePerPersonToShow + " " + pronanc);




    }
}
