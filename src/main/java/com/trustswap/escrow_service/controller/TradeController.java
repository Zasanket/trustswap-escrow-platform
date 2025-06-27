package com.trustswap.escrow_service.controller;

import com.trustswap.escrow_service.model.Trade;
import com.trustswap.escrow_service.service.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trades")
@RequiredArgsConstructor
public class TradeController {

    private final TradeService tradeService;


    @PostMapping
    public ResponseEntity<Trade> createTrade(@RequestBody Trade trade) {
        return ResponseEntity.ok(tradeService.createTrade(trade));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trade> getTrade(@PathVariable Long id){
        return ResponseEntity.ok(tradeService.getTradeById(id));
    }

}
