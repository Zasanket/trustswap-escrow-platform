package com.trustswap.escrow_service.service;

import com.trustswap.escrow_service.model.Trade;
import com.trustswap.escrow_service.repository.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TradeService {
    private final TradeRepository tradeRepository;



    public Trade createTrade(Trade trade){
        if (trade == null) {
            throw new IllegalArgumentException("Trade request cannot be null");
        }
      trade.setStatus("PENDING");
        return tradeRepository.save(trade);
    }
    public Trade getTradeById(Long id){
        return tradeRepository.findById(id).orElseThrow();
    }


}
