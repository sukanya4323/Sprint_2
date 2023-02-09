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

import com.example.OnlineAyurvedaMedicine.entity.Medicine;
import com.example.OnlineAyurvedaMedicine.service.MedicineService;

/**
 * 
 * @author Tentu Sindhu
 *
 */
@RestController
public class MedicineController {
	@Autowired
	private MedicineService medServ;
	
	/**
	 * 
	 * @param med
	 * @return
	 */
	@PostMapping("/saveMedicine")
	public ResponseEntity<Medicine>saveMedicine(@RequestBody Medicine med) {
		Medicine savedMed=medServ.saveMedicine(med);
		return new ResponseEntity<>(savedMed, HttpStatus.CREATED);
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/allMedicines")
	public ResponseEntity<List<Medicine>> getAllMedicines() {
		List<Medicine> medicines = medServ.getAllMedicines();
		return new ResponseEntity<>(medicines,HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/getMedicine/{id}")
	public ResponseEntity<Optional<Medicine>> getMedicineById(@PathVariable int id){
		Optional<Medicine> med=medServ.getMedicineById(id);
		return new ResponseEntity<>(med, HttpStatus.OK);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/delMedicine/{id}")
	public ResponseEntity<String> deleteMedicineById(@PathVariable long id) {
		String med = medServ.deleteMedicineById(id);
		return new ResponseEntity<>(med,HttpStatus.OK);
		}
	
	/**
	 * 
	 * @param med
	 * @return
	 */
	@PutMapping("/updateMedicine/{id}")
	public ResponseEntity<Medicine> updateMedicine(@RequestBody Medicine med) {
		Medicine upMed = medServ.updateMedicineById(med);
		return new ResponseEntity<>(upMed,HttpStatus.OK);
	} 
	
	/**
	 * 
	 * @param medicineName
	 * @return
	 */
	@GetMapping("/getMedicines/{medicineName}")
	public List<Medicine>getMedicineByMedicineName(@PathVariable String medicineName){
		List<Medicine> med=medServ.getMedicineByMedicineName(medicineName);
		return med;
	}

}
