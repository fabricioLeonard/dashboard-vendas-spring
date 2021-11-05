package com.fabricioleonard.dashboardvendas.service;

import com.fabricioleonard.dashboardvendas.dto.SaleDTO;
import com.fabricioleonard.dashboardvendas.dto.SaleSuccessDTO;
import com.fabricioleonard.dashboardvendas.dto.SaleSumDTO;
import com.fabricioleonard.dashboardvendas.entity.Sale;
import com.fabricioleonard.dashboardvendas.repository.SaleRepository;
import com.fabricioleonard.dashboardvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
}
