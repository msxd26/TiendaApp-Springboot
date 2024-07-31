package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaEntity, Integer> {
}
