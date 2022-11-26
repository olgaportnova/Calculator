public class Rubles {
    public String price;
    double pricePerPerson;

    public Rubles(double amount) {
        pricePerPerson = amount;

    }

    public String rubles(Double pricePerPerson) {
        int twoLastDigit = (int) (pricePerPerson % 100);
        if ((twoLastDigit >= 11) && (twoLastDigit <= 14)) {
            price = "рублей";
            return price;
        }

        int LastDigit = twoLastDigit % 10;
        switch (LastDigit) {
            case 1:
                price = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                price = "рубля";
                break;
            default:
                price = "рублей";
        }
        return price;

    }
}
