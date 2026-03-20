package com.food.controller;

import com.food.service.TaxService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/tax")
public class TaxController {

    @Autowired
    private TaxService taxService;

    private static final Logger logger = LoggerFactory.getLogger(TaxController.class);

    @GetMapping("/calculate")
    public String calculateTax(@RequestParam double salary) {
        logger.info("Received request to calculate tax for salary: {}", salary);

        double tax = taxService.calculateTax(salary);
        logger.info("Calculated tax: {} for salary: {}", tax, salary);

        return "Salary: " + salary + " | Tax: " + tax;
    }
}
