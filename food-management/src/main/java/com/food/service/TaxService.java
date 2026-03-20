package com.food.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double calculateTax(double income) {

        // Rule 1: No tax up to 12 lakh
        if (income <= 1200000) {
            return 0;
        }

        double tax = 0;

        if (income > 2400000) {
            tax += (income - 2400000) * 0.30;
            income = 2400000;
        }

        if (income > 2000000 && income <= 230000) {
            tax += (income - 2000000) * 0.25;
            income = 2000000;
        }

        if (income > 1600000) {
            tax += (income - 1600000) * 0.20;
            income = 1600000;
        }

        if (income > 1200000) {
            tax += (income - 1200000) * 0.15;
            income = 1200000;
        }

        if (income > 800000) {
            tax += (income - 800000) * 0.10;
            income = 800000;
        }

        if (income > 400000) {
            tax += (income - 400000) * 0.05;
        }

        return tax;
    }
}
