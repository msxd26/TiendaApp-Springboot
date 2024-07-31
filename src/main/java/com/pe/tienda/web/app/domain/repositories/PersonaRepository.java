package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer> {
}
