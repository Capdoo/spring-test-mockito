package com.mockito.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mockito.app.dto.CarritoDTO;
import com.mockito.app.dto.MensajeDTO;
import com.mockito.app.services.CarritoService;



@RestController
public class CarritoController {

	@Autowired
	CarritoService carritoService;
	
	@PostMapping("/carrito")
	
	
	public ResponseEntity<Object> registrar(@RequestBody CarritoDTO carritoDTO){
		carritoService.save(carritoDTO);
		return new ResponseEntity<Object>(new MensajeDTO("Empleado(a) registrado(a)"),HttpStatus.OK);
	}
}
