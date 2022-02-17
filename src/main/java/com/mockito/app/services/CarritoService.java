package com.mockito.app.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockito.app.dto.CarritoDTO;
import com.mockito.app.models.CarritoModel;
import com.mockito.app.repositories.CarritoRepository;

@Service
public class CarritoService {
	
	
	@Autowired
	CarritoRepository carritoRepository;
	
	public void save(CarritoDTO carritoDTO) {
		//CarritoModel carrito = carritoRepository.findById(carritoDTO.getIdCarrito()).get();
		CarritoModel nuevoCarrito = new CarritoModel();
			nuevoCarrito.setIdCliente(carritoDTO.getIdCliente());
			nuevoCarrito.setFechaCompra(new Date());
			nuevoCarrito.setImpuestos(carritoDTO.getImpuestos());
			nuevoCarrito.setTotal(carritoDTO.getTotal());
		carritoRepository.save(nuevoCarrito);
	}
	
	

}
