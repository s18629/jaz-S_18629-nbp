package com.example.jazS_18629nbp.service;

import com.example.jazS_18629nbp.conf.RestTemplateConf;
import com.example.jazS_18629nbp.model.CurrencyModel;
import com.example.jazS_18629nbp.model.Root;
import com.example.jazS_18629nbp.repository.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    private final RestTemplateConf restTemplateConf;
    private final CurrencyRepository currencyRepository;


    public CurrencyService(RestTemplateConf restTemplateConf, CurrencyRepository currencyRepository) {
        this.restTemplateConf = restTemplateConf;
        this.currencyRepository = currencyRepository;
    }

//       public Double getAverageCurrency(String currency, String firstDate, String secondDate){
//       String url = "api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" +firstDate+ "/" +secondDate + "/?format=json";
//       Root root = restTemplateConf.restTemplate().getForEntity(url, Root.class).getBody();
//
//    }
}
