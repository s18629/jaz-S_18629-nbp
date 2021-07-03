package com.example.jazS_18629nbp.controller;

import com.example.jazS_18629nbp.service.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

        @GetMapping("currency/{curr}/{firstDate}/{secondDate}")
        public double calculateAverageController(@PathVariable String curr,
                                                 @PathVariable String firstDate, @PathVariable String secondDate){
        return currencyService.getAverageCurrency(curr,firstDate,secondDate);
        }
}
