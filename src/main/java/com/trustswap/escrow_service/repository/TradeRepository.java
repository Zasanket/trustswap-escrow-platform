package com.trustswap.escrow_service.repository;

import com.trustswap.escrow_service.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Long> {
}
