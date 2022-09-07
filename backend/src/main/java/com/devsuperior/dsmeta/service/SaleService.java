package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.entities.SaleEntity;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    //Quem acessa o banco de dados é o repository
    @Autowired
    private SaleRepository saleRepository;

    public List<SaleEntity> findSales() {
        return saleRepository.findAll();

    }

}
