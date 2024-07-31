package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.DetalleIngresoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleIngresoRepository extends JpaRepository<DetalleIngresoEntity , Integer> {
}
