package com.relationship.MockitoCaseStudy;

public class Order {

    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public String placeOrder(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Order Amount");
        }

        boolean paymentStatus = payment.processPayment(amount);

        if (!paymentStatus) {
            throw new RuntimeException("Payment Failed");
        }

        return "Order Confirmed";
    }
}
