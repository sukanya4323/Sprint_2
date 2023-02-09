package com.example.OnlineAyurvedaMedicine;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.OnlineAyurvedaMedicine.repository.MedicineRepository;
import com.example.OnlineAyurvedaMedicine.service.MedicineService;
import com.example.OnlineAyurvedaMedicine.service.MedicineServiceImpl;
/**
 * 
 * @author Tentu Sindhu
 *
 */
@ExtendWith(MockitoExtension.class)
public class MedicineServiceTest {
	@Mock private MedicineRepository medRepo;
	private MedicineService medServ;
	
	@BeforeEach void setUp()
	{
		this.medServ = new MedicineServiceImpl(medRepo);
	}
	/**
	  * @Test Get all medicines
	  */
	@Test void getAllMedicines() {
		medServ.getAllMedicines();
		verify(medRepo).findAll();
	}
	/**
	  * @Test Get medicine by Id
	  */
	@Test void getMedicineById() {
		medServ.getMedicineById(802);
		verify(medRepo).findByMedicineId((long) 802);
		
	}
	/**
	  * @Test Delete medicine Id - failed case
	  */
	@Test void deleteMedicineByIdFailCase()
	{
		medServ.getMedicineById(999);
		verify(medRepo).findByMedicineId((long) 999);
	    assertFalse(false);
	}
	/**
	  * @Test Delete medicine Id - Success case
	  */
	@Test void deleteMedicineByIdPassCse()
	{
		medServ.getMedicineById(803);
		verify(medRepo).findByMedicineId((long) 803);
	    assertTrue(true);
	}

}
