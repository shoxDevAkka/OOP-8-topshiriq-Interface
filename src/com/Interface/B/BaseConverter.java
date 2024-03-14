package com.Interface.B;

public class BaseConverter implements Converter{
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public void celsiusToKelvin() {
        double K = celsius + 273.15;
        System.out.println("Selsiy -> Kelvin : " + K);
    }

    @Override
    public void celsiusToFahrenheit() {
        double F = celsius*(9.0/5) + 32;
        System.out.println("Selsiy -> Farengeyt : " + F);
    }
}
