package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.IngresosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoRepository extends JpaRepository<IngresosEntity, Integer> {
}
