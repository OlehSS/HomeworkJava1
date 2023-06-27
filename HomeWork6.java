package Hw.Homeworks;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        Random t = new Random();

        int n = t.nextInt(28801);       // [0;28800)

        int g = n / 3600;

        if (n == 1) {
            System.out.println("Осталась одна секунда");}
        if (n >= 5) {
            System.out.println("Осталось " + n + " секунд");};
        if (n == 2 || n == 3 || n == 4) {
            System.out.println("Осталось " + n + " секунды");}

        // Значений для часов не много и их можно прописать для более детального вывода, но так как для секунд их очень много решил на этом остановится.


        if (g < 1) {
            System.out.println("Осталось менее часа");}
        if (g >= 5) {
            System.out.println("Осталось " + g + " полных часов");};
        if (g == 1) {
            System.out.println("Остался 1 час");}
        if (g == 2 || g == 3 || g == 4) {
            System.out.println("Осталось " + g + " полных часа");
        }


    }
}

