package com.mockito.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mockito.app.models.ItemModel;


public interface ItemRepository extends JpaRepository<ItemModel, Long>{

	
	public Optional<ItemModel> findById(long id);
	
}
