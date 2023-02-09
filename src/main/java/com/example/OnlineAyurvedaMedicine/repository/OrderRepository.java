package com.example.OnlineAyurvedaMedicine.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OnlineAyurvedaMedicine.entity.Order;

/**
 * 
 * @author Sukanya
 *
 */
public interface OrderRepository extends JpaRepository<Order , Long> {

	/**
	 * 
	 * @param orderId
	 * @return
	 */
	Optional<Order> findByOrderId(long orderId);

	/**
	 * 
	 * @param orderId
	 */
	void deleteByOrderId(long orderId);
	

}
