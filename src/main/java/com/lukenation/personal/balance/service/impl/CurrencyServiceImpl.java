package com.lukenation.personal.balance.service.impl;

import com.lukenation.personal.balance.constant.AllowedCurrency;
import com.lukenation.personal.balance.service.CurrencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public List<String> getAllowedCurrencies() {
        log.info("se obtienen las monedas permitidas para las operaciones");
        return Arrays.stream(AllowedCurrency.values()).map(AllowedCurrency::getCurrencyCode).collect(Collectors.toList());
    }
}
