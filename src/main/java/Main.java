import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static String price;

    public static void main(String[] args) {

            System.out.println ("На скольких человек необходимо разделить счет?");
            int x;
            while (true) {
            Scanner scanner0 = new Scanner(System.in);
                if (scanner0.hasNextInt()) {
                    x = scanner0.nextInt();
                }
                else {
                    System.out.println("Введите число!");
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
            Scanner scanner = new Scanner(System.in);
            String itemName;
            itemName = scanner.next();
            double itemPrice=0d;
            while (true){
            System.out.println("Введите цену товара в формате 'рубли.копейки' [10.45, 11.40].");
            Scanner scanner2 = new Scanner(System.in);

            //itemPrice = scanner2.nextFloat();
            if (scanner2.hasNextDouble()) {
                    itemPrice = scanner2.nextDouble();
                    if (itemPrice>=0){
                        break;
                    }

                }

            }
            Item item = new Item(itemName, itemPrice);
            calculator1.sum(item);
            System.out.println("Товар добавлен в корзину. Если хотите завершить - напишите 'завершить', если продолжить - любой символ.");
            Scanner scanner1 = new Scanner(System.in);
            String end = scanner1.next();
            end=end.toLowerCase();
//            System.out.println(end);
            if (Objects.equals(end, "завершить")){
//                System.out.println("Все товары добавлены.");
//                System.out.println(calculator1.calculatorSumm);
//                System.out.println(calculator1.calculatorItemList);
                break;
            }
        }
        double pricePerPerson = calculator1.calculatorSumm / x;
        String pricePerPersonToShow = String.format("%.2f", pricePerPerson);
        Rubles pron = new Rubles (pricePerPerson);
        pron.rubles(pricePerPerson);
        String pronanc=Rubles.price;
        System.out.println( "Все добавленные товары:" +  calculator1.calculatorItemList);
        System.out.println("Каждый человек должен заплатить: " + pricePerPersonToShow + " " + pronanc);




    }
}
