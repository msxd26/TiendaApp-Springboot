package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
