package com.gestion.productos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.productos.entidades.Producto;
import com.gestion.productos.servicio.ProductoServicio;

@Controller
@RequestMapping("/productos")
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @Autowired
    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping("/")
    public String verPaginaDeInicio(@RequestParam(name = "palabraClave", required = false) String palabraClave, Model model) {
        List<Producto> listaProductos = productoServicio.listAll(palabraClave);
        model.addAttribute("listaProductos", listaProductos);
        model.addAttribute("palabraClave", palabraClave);
        model.addAttribute("producto", new Producto());
        return "index"; // Esta es la vista que deseas utilizar
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        productoServicio.save(producto);
        return "index";
    }

    @GetMapping("/editar/{id}")
    public ModelAndView mostrarFormularioDeEditarProducto(@PathVariable(name = "id") Long id) {
        ModelAndView modelo = new ModelAndView("nuevo_producto");

        Producto producto = productoServicio.get(id);
        modelo.addObject("producto", producto);
        return modelo;
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable(name = "id") Long id) {
        productoServicio.delete(id);
        return "redirect:/productos/";
    }
}

