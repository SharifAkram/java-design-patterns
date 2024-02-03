package org.example;

interface TaxCalculator {
    double calculate(double basePrice);
}

class Order {
    private double basePrice;
    private TaxCalculator taxCalculator;

    public Order(double basePrice, TaxCalculator taxCalculator) {
        this.basePrice = basePrice;
        this.taxCalculator = taxCalculator;
    }

    public double getTotalPrice() {
        return basePrice + taxCalculator.calculate(basePrice);
    }
}

class SimpleTaxCalculator implements TaxCalculator {
    private static final double TAX_RATE = 0.1; // 10% tax rate

    @Override
    public double calculate(double basePrice) {
        return basePrice * TAX_RATE;
    }
}

public class Main {
    public static void main(String[] args) {
        double basePrice = 100.0; // Example base price
        TaxCalculator taxCalculator = new SimpleTaxCalculator(); // Create an instance of the tax calculator
        Order order = new Order(basePrice, taxCalculator); // Create an order with the base price and tax calculator
        System.out.println("Total price: " + order.getTotalPrice()); // Print the total price
    }
}
