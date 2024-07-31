package com.pe.tienda.web.app.infrastructure.services;

import com.pe.tienda.web.app.api.models.request.CategoriaResquest;
import com.pe.tienda.web.app.api.models.response.CategoriaResponse;
import com.pe.tienda.web.app.domain.entities.CategoriaEntity;
import com.pe.tienda.web.app.domain.repositories.CategoriaRepository;
import com.pe.tienda.web.app.infrastructure.abstract_services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Override
    public CategoriaResponse create(CategoriaResquest request) {

        var categoriaToPersist= CategoriaEntity.builder()
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .estado(request.isEstado())
                .build();

        var response = categoriaRepository.save(categoriaToPersist);

        return this.entityToResponse(response);
    }

    @Override
    public CategoriaResponse update(CategoriaResquest categoriaResquest, Integer id) {
        var categoriaToUpdate= categoriaRepository.findById(id).orElseThrow();

        categoriaToUpdate.setNombre(categoriaResquest.getNombre());
        categoriaToUpdate.setDescripcion(categoriaResquest.getDescripcion());
        categoriaToUpdate.setEstado(categoriaResquest.isEstado());

        var categoriaUpdated= categoriaRepository.save(categoriaToUpdate);

        return entityToResponse(categoriaUpdated);
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        var categoriaToDeleteId= categoriaRepository.findById(id).orElseThrow();
        categoriaRepository.delete(categoriaToDeleteId);
        return null;
    }


    private CategoriaResponse entityToResponse(CategoriaEntity categoria){
        CategoriaResponse categoriaResponse = new CategoriaResponse();
        BeanUtils.copyProperties(categoria, categoriaResponse);
        return categoriaResponse;
    }
}
