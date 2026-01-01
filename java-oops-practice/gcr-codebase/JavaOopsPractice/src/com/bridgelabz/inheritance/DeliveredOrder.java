package com.bridgelabz.inheritance;

public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    // Constructor
    public DeliveredOrder(int orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}
