package com.dsmeta.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsmeta.backend.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
