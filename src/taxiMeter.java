import java.util.Scanner;

public class taxiMeter {
    public static void main(String[] args) {
        int distance = 10;
        int time = 20;
        int price = 0;
        if (distance <= 3) {
            price = 10;
        } else if (distance > 3 && distance <= 10) {
            price = 10 + (distance - 3) * 2;
        } else if (distance > 10) {
            price = 10 + 14 + (distance - 10) * 3;
        }
        price += time * 2;
        System.out.println("price = " + price);
    }
}
