package com.gestion.productos.servicio;

import com.gestion.productos.entidades.Producto;
import com.gestion.productos.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    @Autowired
    public ProductoServicio(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    public List<Producto> listAll(String palabraClave) {
        if (palabraClave != null && !palabraClave.isEmpty()) {
            return productoRepositorio.findAll(palabraClave);
        } else {
            return productoRepositorio.findAll();
        }
    }

    public void save(Producto producto) {
        productoRepositorio.save(producto);
    }

    public Producto get(Long id) {
        Optional<Producto> optionalProducto = productoRepositorio.findById(id);
        return optionalProducto.orElse(null);
    }

    public void delete(Long id) {
        productoRepositorio.deleteById(id);
    }

	public Iterable<Producto> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

