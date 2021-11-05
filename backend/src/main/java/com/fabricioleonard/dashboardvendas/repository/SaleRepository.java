package com.fabricioleonard.dashboardvendas.repository;

import com.fabricioleonard.dashboardvendas.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
