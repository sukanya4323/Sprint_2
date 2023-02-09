package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;
import com.example.OnlineAyurvedaMedicine.entity.Category;

/**
 * 
 * @author Devi
 *
 */
public interface CategoryService {

	/**
	 * 
	 * @param cat
	 * @return
	 */
	 Category saveCategoryEntity(Category cat);
	 /**
	  * 
	  * @return
	  */
	List<Category> getAllCategoryEntity();

	/**
	 * 
	 * @param id
	 * @return
	 */
	Optional<Category> getCategoryById(long id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	String deleteCategoryById(long id);

	/**
	 * 
	 * @param cat
	 * @return
	 */
	Category updateCategory(Category cat);
}
