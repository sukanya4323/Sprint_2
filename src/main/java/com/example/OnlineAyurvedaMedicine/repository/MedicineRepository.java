package com.example.OnlineAyurvedaMedicine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAyurvedaMedicine.entity.Medicine;

/**
 * 
 * @author Tentu Sindhu
 *
 */
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

	/**
	 * 
	 * @param medicineName
	 * @return
	 */
	List<Medicine> findByMedicineName(String medicineName);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Optional<Medicine> findByMedicineId(long id);

}
