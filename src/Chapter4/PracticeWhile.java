package Chapter4;

public class PracticeWhile {
    public static void main(String[] args){
        int coffee_price = 100;
        int money = 300;

        while (money > 0){
            System.out.println("Coffee saled");
            money -= coffee_price;
            System.out.printf("money left: %d\n", money);
        }
    }
}
