package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Medicine;
import com.example.OnlineAyurvedaMedicine.repository.MedicineRepository;
import com.example.OnlineAyurvedaMedicine.repository.UserRepository;

/**
 * 
 * @author Tentu Sindhu
 *
 */
@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	private MedicineRepository medRepo;
	/**
	 * 
	 * @param medicineRepo
	 */
	public MedicineServiceImpl(MedicineRepository medicineRepo){
		this.medRepo = medicineRepo;
	}

	public Medicine saveMedicine(Medicine med) {
		return medRepo.save(med);

	}

	public List<Medicine> getAllMedicines() {
		return medRepo.findAll();
	}

	public Optional<Medicine> getMedicineById(long id) {
		return medRepo.findByMedicineId(id);
	}

	public String deleteMedicineById(long id) {
		Optional<Medicine> med = medRepo.findByMedicineId(id);
		if (med.isPresent()) {
			medRepo.deleteById(id);
			return "deleted sucessfully";
		}
		return "id doesn't exist";
	}

	public Medicine updateMedicineById(Medicine med) {
		return medRepo.save(med);
	}
	public List<Medicine> getMedicineByMedicineName(String medicineName) {
		return medRepo.findByMedicineName(medicineName);
	}

}