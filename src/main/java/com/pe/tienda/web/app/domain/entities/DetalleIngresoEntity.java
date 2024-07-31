package com.pe.tienda.web.app.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "detalle_ingresos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleIngresoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalle_ingreso")
    private Integer idDetalleIngreso;
    private Integer cantidad;
    private BigDecimal precio;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idingreso")
    private IngresosEntity ingreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idarticulo")
    private ArticuloEntity articulo;


}
