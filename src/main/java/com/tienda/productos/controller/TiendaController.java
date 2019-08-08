package com.tienda.productos.controller;

import java.util.ArrayList;
import java.util.List;


import com.tienda.productos.model.Tienda;

public class TiendaController {
	
	
	private static List<Tienda>tiendas =new ArrayList<>();
	
	static {
		Tienda producto=new Tienda();
		producto.setId("1");
		producto.setProducto("jabon");
		producto.setPrecio(12.5);
		
		
		tiendas.add(producto);
	}
	public Tienda crearNuevo(Tienda tienda) {
		tienda.setId(tiendas.size()+1+"");
		tiendas.add(tienda);
		return tienda;
		
		
	}
	
	public List<Tienda> obtener(){
		return tiendas;
	}

}
