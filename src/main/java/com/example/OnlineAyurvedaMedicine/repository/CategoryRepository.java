package com.example.OnlineAyurvedaMedicine.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlineAyurvedaMedicine.entity.Category;

/**
 * 
 * @author Devi
 *
 */
	@Repository
	public interface CategoryRepository extends JpaRepository<Category, Long> {

		/**
		 * 
		 * @param id
		 * @return
		 */
		Optional<Category> findByCategoryId(long id);

		

	}