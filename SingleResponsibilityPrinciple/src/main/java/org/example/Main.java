package org.example;

class Order {
    private int id;
    private String customer;
    private double amount;

    Order(int id, String customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }
}

class OrderDatabase {
    void save(Order order) {
        // saving order to the database
        System.out.println("Order saved to database: " + order.getId());
    }
}

class EmailSender {
    void sendInvoice(Order order) {
        // sending invoice email to the customer
        System.out.println("Invoice email sent to: " + order.getCustomer());
    }
}

class InvoicePrinter {
    void print(Order order) {
        // printing invoice
        System.out.println("Invoice printed for order: " + order.getId() + " for amount: " + order.getAmount());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order(1, "Sharif Akram", 125.47);

        // Save the order to the database
        OrderDatabase orderDatabase = new OrderDatabase();
        orderDatabase.save(order);

        // Send invoice email
        EmailSender emailSender = new EmailSender();
        emailSender.sendInvoice(order);

        // Print invoice
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.print(order);
    }
}
