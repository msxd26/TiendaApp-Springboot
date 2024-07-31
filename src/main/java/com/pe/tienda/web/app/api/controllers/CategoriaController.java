package com.pe.tienda.web.app.api.controllers;


import com.pe.tienda.web.app.api.models.request.CategoriaResquest;
import com.pe.tienda.web.app.api.models.response.CategoriaResponse;
import com.pe.tienda.web.app.infrastructure.abstract_services.CategoriaService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@AllArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;


    @PostMapping("/create")
    public ResponseEntity<CategoriaResponse> create(@RequestBody CategoriaResquest request){
        return ResponseEntity.ok(categoriaService.create(request));
    }

    @PutMapping("{id}")
    public ResponseEntity<CategoriaResponse> update(@PathVariable Integer id, @RequestBody CategoriaResquest request){
        return ResponseEntity.ok(categoriaService.update(request,id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
