package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import com.example.OnlineAyurvedaMedicine.entity.Medicine;

/**
 * 
 * @author Tentu Sindhu
 *
 */
public interface MedicineService {
	/**
	 * 
	 * @param med
	 * @return
	 */
	Medicine saveMedicine(Medicine med);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Optional<Medicine> getMedicineById(long id);
	/**
	 * 
	 * @return
	 */
	List<Medicine> getAllMedicines();
	/**
	 * 
	 * @param id
	 * @return
	 */
	String deleteMedicineById(long id);
	/**
	 * 
	 * @param med
	 * @return
	 */
	Medicine updateMedicineById(Medicine med);
	/**
	 * 
	 * @param medicneName
	 * @return
	 */
	List<Medicine> getMedicineByMedicineName(String medicneName);

}
