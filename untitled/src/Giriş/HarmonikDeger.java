package Giriş;

import java.util.Scanner;

public class HarmonikDeger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Bir değer girin: ");
        n = input.nextInt();

        double result = 0;
        for (int i = 1; i <= n; i++) {

            result += (1.0 / i);


        }
        System.out.print(result);


    }
}
