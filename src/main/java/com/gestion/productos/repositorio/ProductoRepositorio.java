package com.gestion.productos.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Producto;

public interface ProductoRepositorio extends JpaRepository <Producto , Long> {

	@Query("SELECT p FROM Producto p WHERE"
			+ " CONCAT(p.id,p.nombre,p.marca,p.hechoEn,p.precio)"
			+ " LIKE %?1%")
	public 
	
	List<Producto> findAll(String palabraClave);

	Optional<Producto> findById(Long id);

}
