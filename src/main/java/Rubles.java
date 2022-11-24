public class Rubles {
    public static String price;
    double pricePerPerson;

    public Rubles (double amount){
        pricePerPerson=amount;
    }
    public String rubles(Double pricePerPerson) {
        int preLastDigit = (int) (pricePerPerson % 100 / 10);
        if (preLastDigit==1) {
            price ="рублей";
        }
        switch (preLastDigit % 10) {
            case 1:
                price="рубль";
            case 2:
            case 3:
            case 4:
                price = "рубля";
            default:
                price = "рублей";
        }
        return price;
    }

}
