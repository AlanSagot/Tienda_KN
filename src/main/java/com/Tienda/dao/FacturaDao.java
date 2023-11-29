package com.Tienda.dao;

import com.Tienda.controller.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository <Factura,Long> {
    
}