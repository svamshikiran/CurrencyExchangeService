package com.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currency.exchange.model.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
	//select * from exchange_value where currency_from=? and currency_to=?
}
