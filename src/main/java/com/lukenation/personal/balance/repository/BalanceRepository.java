package com.lukenation.personal.balance.repository;

import com.lukenation.personal.balance.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<Balance, Long> {
}