package com.fabricioleonard.dashboardvendas.repository;

import com.fabricioleonard.dashboardvendas.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
