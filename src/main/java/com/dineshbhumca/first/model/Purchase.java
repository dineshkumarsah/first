package com.dineshbhumca.first.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Purchase {
    private LocalDate date;
    private double quantityKg;
    private double ratePerKg;
    private double totalAmount;
    private String paymentType;
    private double paidAmount;
    private double remainingAmount;

}
