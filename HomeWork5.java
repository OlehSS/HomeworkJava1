package Hw.Homeworks;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        double PI = 3.14;

        Scanner k = new Scanner(System.in);

        int y = 24;
        double S = PI * (y / 2);
        double l = S * 40;
        // Теперь "l" будет для нашего задания константой

        System.out.println("Enter pls diameter of your pizza: ");
        int p = k.nextInt();

        double S1 = PI * (p / 2);
        double l2 = S1 * 40;

        double result = l2 - l;

        // Сделал так чтобы округляло до нижнего целого
        int roundedResult = (int) Math.floor(result);


        System.out.println("You pizza have " + roundedResult + " calories than normal" );

        k.close();

    }
}
