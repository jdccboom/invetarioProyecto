package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoProducto;
import org.example.producto.domain.model.enums.TipoProducto;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("producto")
@Builder
public class ProductEntity {
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column("estado")
    private EstadoProducto estado;
    @Column("nombre")
    private String nombre;
    @Column("descrpcion")
    private String descripcion;
    @Column("cantidad")
    private int cantidad;
    @Column("precioProvedor")
    private double precioProvedor;
    @Column("precioVenta")
    private double precioVenta;
    @Column("imagen")
    private String imagen;
    @Column ("tipo")
    private TipoProducto tipo;
    @OneToMany (mappedBy = "idproveedor")
    private ProveedorEntity idProveedor;
}

