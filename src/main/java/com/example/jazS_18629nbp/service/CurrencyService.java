package com.example.jazS_18629nbp.service;

import com.example.jazS_18629nbp.conf.RestTemplateConf;
import com.example.jazS_18629nbp.model.CurrencyModel;
import com.example.jazS_18629nbp.model.Rate;
import com.example.jazS_18629nbp.model.Root;
import com.example.jazS_18629nbp.repository.CurrencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CurrencyService {

    private final RestTemplateConf restTemplateConf;
    private final CurrencyRepository currencyRepository;

    public CurrencyService(RestTemplateConf restTemplateConf, CurrencyRepository currencyRepository) {
        this.restTemplateConf = restTemplateConf;
        this.currencyRepository = currencyRepository;
    }

       public double getAverageCurrency(String currency, String firstDate, String secondDate){
       String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" +firstDate+ "/" +secondDate + "/?format=json";
       Root root = restTemplateConf.restTemplate().getForEntity(url, Root.class).getBody();

       return calculateAverage(root.getRates());
    }

    public double calculateAverage(List<Rate> rateList){
        double sum = 0;
        for (Rate rate : rateList){
            double averageDouble = rate.getMid();
            double average = averageDouble;
            sum += average;
        }
        return sum/rateList.size();
    }


}
