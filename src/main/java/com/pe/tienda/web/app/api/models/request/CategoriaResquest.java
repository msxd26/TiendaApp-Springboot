package com.pe.tienda.web.app.api.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CategoriaResquest implements Serializable {

    private String nombre;
    private String descripcion;
    private boolean estado;
}
