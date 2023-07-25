package com.currency.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.model.ExchangeValue;
import com.currency.exchange.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);

		exchangeValue.setPort(1000);

		System.out.println("Exchange Value: "+exchangeValue);

		return exchangeValue;
	}

}
