package com.tienda.productos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.productos.model.Tienda;
@RestController
@RequestMapping("/api/v1/tienda")

public class TiendaController {
	
	
	private static List<Tienda>tiendas =new ArrayList<>();
	
	static {
		Tienda producto=new Tienda();
		producto.setId("1");
		producto.setProducto("jabon");
		producto.setPrecio(12.5);
		
		
		tiendas.add(producto);
	}
	
	@PostMapping
	public Tienda crearNuevo(Tienda tienda) {
		tienda.setId(tiendas.size()+1+"");
		tiendas.add(tienda);
		return tienda;
		
		
	}
	@GetMapping
	public List<Tienda> obtener(){
		return tiendas;
	}

}
