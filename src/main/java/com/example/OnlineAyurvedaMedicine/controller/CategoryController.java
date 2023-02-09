package com.example.OnlineAyurvedaMedicine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineAyurvedaMedicine.entity.Category;
import com.example.OnlineAyurvedaMedicine.service.CategoryService;
 
/**
 * 
 * @author Devi
 *
 */
@RestController
public class CategoryController {

	@Autowired
	private CategoryService catServ;

	/**
	 * 
	 * @param cat
	 * @return
	 */
	@PostMapping("/saveCategory")
	public ResponseEntity<Category> saveCategory(@RequestBody Category cat) {
		Category savedCat = catServ.saveCategoryEntity(cat);
		return new ResponseEntity<>(savedCat, HttpStatus.CREATED);

	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/allCategory")
	public ResponseEntity<List<Category>> getAllCategory() {
		List<Category> categoryEntity = catServ.getAllCategoryEntity();
		return new ResponseEntity<>(categoryEntity, HttpStatus.OK);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/getCategory/{id}")
	public ResponseEntity<Optional<Category>> getCategoryId(@PathVariable long id) {
		Optional<Category> cat = catServ.getCategoryById(id);
		return new ResponseEntity<>(cat, HttpStatus.OK);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/deleteCategory/{id}")
	public ResponseEntity<String> deleteCategoryById(@PathVariable long id) {
		String cat = catServ.deleteCategoryById(id);
		return new ResponseEntity<String>(cat, HttpStatus.OK);
	}

	/**
	 * 
	 * @param cat
	 * @return
	 */
	@PutMapping("/updateCategory")
	public ResponseEntity<Category> updateCategory(@RequestBody Category cat) {
		Category upCat = catServ.updateCategory(cat);
		return new ResponseEntity<>(upCat, HttpStatus.OK);
	}
}