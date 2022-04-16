package com.lukenation.personal.balance.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum AllowedCurrency {
    EURO("Euro", "EUR", "€", 1),
    DOLAR("Dolar", "USD", "U$D", 2),
    PESOS("Peso", "ARS", "$", 3),
    LIBRAS("Libra", "GBP", "£", 4);


    private String currency;
    private String currencyCode;
    private String currencySymbol;
    private int position;

    public AllowedCurrency checkCurrency(String currencyCode) {
        return Arrays.stream(AllowedCurrency.values()).filter((each) -> {
            return each.getCurrencyCode().equals(currencyCode);
        }).collect(Collectors.toList()).get(0);
    }
}
