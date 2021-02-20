package br.com.felipepedrosa.springapplication.entities.enums;

import java.util.Arrays;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    /**
     * Code of status.
     */
    private final int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public static OrderStatus valueOf(int code) {
        return Arrays.stream(OrderStatus.values())
                .filter(orderStatus -> orderStatus.getCode() == code)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid order status code"));
    }

    public int getCode() {
        return code;
    }
}
