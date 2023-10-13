package com.Tienda.dao;

import com.Tienda.controller.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
    
    
}