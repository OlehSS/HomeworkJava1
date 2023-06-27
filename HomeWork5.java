package Hw.Homeworks;

public class HomeWork5 {
    public static void main(String[] args) {

        double PI = 3.14;


        int y = 24;
        double S = PI * Math.pow((y / 2), 2);
        double l = S * 40;

        int p = 28;
        double S1 = PI * Math.pow((p / 2), 2);
        double l2 = S1 * 40;

        double result = l2 - l;

        // Сделал так чтобы округляло до нижнего целого
        int roundedResult = (int) Math.floor(result);


        System.out.println("Pizza 28sm have " + roundedResult + " calories more than 24sm" );


    }
}
