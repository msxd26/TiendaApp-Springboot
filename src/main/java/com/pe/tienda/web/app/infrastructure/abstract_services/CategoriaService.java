package com.pe.tienda.web.app.infrastructure.abstract_services;

import com.pe.tienda.web.app.api.models.request.CategoriaResquest;
import com.pe.tienda.web.app.api.models.response.CategoriaResponse;

public interface CategoriaService extends SimpleCrudService<CategoriaResquest, CategoriaResponse,Integer> {
}
