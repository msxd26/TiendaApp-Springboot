package com.pe.tienda.web.app.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "categorias")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcategoria")
    private Integer idCategoria;
    private String nombre;
    private String descripcion;
    private Boolean estado;

    @ToString.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "categoria"
    )
    private List<ArticuloEntity> articulos;

}
