package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.DetalleVentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaRepository extends JpaRepository<DetalleVentaEntity, Integer> {
}
