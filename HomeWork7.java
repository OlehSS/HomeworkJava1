package Hw.Homeworks;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = x.nextInt();

        if (a % 2 == 0 ) {
            System.out.println("Чётное");
        }
        else {
            System.out.println("Нечётное");
        }

        x.close();
    }
}
