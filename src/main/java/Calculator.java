public class Calculator {
    double calculatorSumm;
    String calculatorItemList;

    public Calculator(double summ, String itemList) {
        calculatorSumm = summ;
        calculatorItemList = itemList;
    }

    public void sum(Item item) {
        calculatorSumm = calculatorSumm + item.itemPrice;
        calculatorItemList = calculatorItemList + "\n" + item.itemName;
    }

}
