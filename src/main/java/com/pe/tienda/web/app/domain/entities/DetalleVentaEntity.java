package com.pe.tienda.web.app.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_ventas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleVentaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalle_venta")
    private Integer idDetalleVenta;
    private Integer cantidad;
    private BigDecimal precio;
    private BigDecimal descuento;

    @ManyToOne
    @JoinColumn(name = "idventa")
    private VentaEntity venta;

    @ManyToOne
    @JoinColumn(name = "idarticulo")
    private ArticuloEntity articulo;

}
