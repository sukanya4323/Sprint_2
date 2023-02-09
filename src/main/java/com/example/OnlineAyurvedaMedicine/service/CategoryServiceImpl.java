package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Category;
import com.example.OnlineAyurvedaMedicine.repository.CategoryRepository;

/**
 * 
 * @author Devi
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository catRepo;
	 
	@Override
	public Category saveCategoryEntity(Category cat) {

		return catRepo.save(cat);
	}

	@Override
	public List<Category> getAllCategoryEntity() {
		return catRepo.findAll();
	}

	@Override
	public Optional<Category> getCategoryById(long id) {
		return catRepo.findByCategoryId(id);
	}

	@Override
	public String deleteCategoryById(long id) {
		Optional<Category> cat = catRepo.findByCategoryId(id);
		if (cat.isPresent()) {
			catRepo.deleteById(id);
			return "deleted sucessfully";
		}

		return "id doesn't exist";
	}

	@Override
	public Category updateCategory(Category cat) {
		return catRepo.save(cat);
	}

}
