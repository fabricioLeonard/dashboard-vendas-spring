package com.fabricioleonard.dashboardvendas.repository;

import com.fabricioleonard.dashboardvendas.dto.SaleSuccessDTO;
import com.fabricioleonard.dashboardvendas.dto.SaleSumDTO;
import com.fabricioleonard.dashboardvendas.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.fabricioleonard.dashboardvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
           + "FROM Sale obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.fabricioleonard.dashboardvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + "FROM Sale obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
