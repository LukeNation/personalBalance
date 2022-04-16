package com.lukenation.personal.balance.controller;

import com.lukenation.personal.balance.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller para el manejo de currency
 */
@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/allowed")
    public List<String> getAllowedCurrency() {
        return currencyService.getAllowedCurrencies();
    }
}
