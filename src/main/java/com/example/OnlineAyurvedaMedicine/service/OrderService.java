package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Order;
/**
 * 
 * @author Sukanya
 *
 */
@Service
public interface OrderService {
	/**
	 * 
	 * @param od
	 * @return
	 */
	Order saveOrder(Order od);
	/**
	 * 
	 * @return
	 */
	List<Order> getAllOrders();
	/**
	 * 
	 * @param od
	 * @return
	 */
	Order updateOrder(Order od);
	/**
	 * 
	 * @param orderId
	 * @return
	 */
	String deleteOrderById(long orderId);
	/**
	 * 
	 * @param orderId
	 * @return
	 */
	Optional<Order> getOrderById(long orderId);
	
	
}
