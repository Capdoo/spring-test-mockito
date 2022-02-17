package com.mockito.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mockito.app.models.CarritoModel;


public interface CarritoRepository extends JpaRepository<CarritoModel, Long>{

	
	public Optional<CarritoModel> findById(long id);
	
}
