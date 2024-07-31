package com.pe.tienda.web.app.api.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CategoriaResponse implements Serializable {

    private String nombre;
    private String descripcion;
    private boolean estado;
}
