package com.mockito.app.services;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mockito.app.repositories.CarritoRepository;

public class CarritoServiceTest {

	@Mock
	private CarritoRepository carritoRepository;
 
	@InjectMocks
	private CarritoService carritoService;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
}
