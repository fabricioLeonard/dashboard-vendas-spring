package com.fabricioleonard.dashboardvendas.service;

import com.fabricioleonard.dashboardvendas.dto.SellerDTO;
import com.fabricioleonard.dashboardvendas.entity.Seller;
import com.fabricioleonard.dashboardvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
