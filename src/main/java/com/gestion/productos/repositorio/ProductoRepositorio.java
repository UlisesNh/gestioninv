package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE "
            + "CONCAT(p.id, p.sku, p.articulo, p.marca, p.modelo, "
            + "p.departamento, p.clase, p.familia, p.fechaAlta, "
            + "p.stock, p.cantidad, p.descontinuado, p.fechaBaja) "
            + "LIKE %?1%")
    List<Producto> findAll(String palabraClave);

}
