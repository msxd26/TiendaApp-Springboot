package com.pe.tienda.web.app.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ingresos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IngresosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idingreso")
    private Integer id;

    private String tipoDocumento;
    private String serieDocumento;
    private String numeroDocumento;
    private LocalDate fecha;
    private BigDecimal decimal;
    private BigDecimal total;
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproveedor")
    private PersonaEntity persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "ingreso"

    )
    private List<DetalleIngresoEntity> detalleIngresos;
}
