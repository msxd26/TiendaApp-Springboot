package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<ArticuloEntity, Integer> {
}
