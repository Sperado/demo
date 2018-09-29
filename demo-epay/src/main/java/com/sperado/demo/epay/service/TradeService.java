package com.sperado.demo.epay.service;

import com.sperado.demo.epay.mapper.TradeMapper;
import com.sperado.demo.epay.model.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradeService {

    @Autowired
    private TradeMapper tradeMapper;

    public int createTrade(Trade trade) {
        return tradeMapper.insertSelective(trade);
    }
}
