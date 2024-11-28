package com.example.Retail_shop.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "order",schema = "public",catalog = "Retail")

public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "order_date")
    private String orderDate;
    @Column(name = "order_total_amount")
    private int orderTotalAmount;
    @Column(name = "order_status")
    private String orderStatus;

}
