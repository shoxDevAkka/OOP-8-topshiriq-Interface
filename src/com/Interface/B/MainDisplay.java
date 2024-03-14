package com.Interface.B;

import java.util.Scanner;

public class MainDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter baseConverter = new BaseConverter();

        System.out.println("Selsiy qiymatini kiriting :");
        double celsius = scanner.nextDouble();
        baseConverter.setCelsius(celsius);

        System.out.println();
        System.out.println("Natijalar :");
        baseConverter.celsiusToKelvin();
        baseConverter.celsiusToFahrenheit();
    }
}
