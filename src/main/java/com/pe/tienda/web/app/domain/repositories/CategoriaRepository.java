package com.pe.tienda.web.app.domain.repositories;

import com.pe.tienda.web.app.domain.entities.CategoriaEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<CategoriaEntity, Integer> {
}
