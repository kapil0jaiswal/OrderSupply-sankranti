/**
 * 
 */
package com.sankranthi.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import com.sankranthi.domain.Product;


/**
 * @author Kapil
 *
 */
@Stateless
public class OrderServiceImpl implements OrderService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see main.service.OrderService#createProduct(int)
	 */
	
	public List<Product> createProduct(int size) {
		List<Product> list = new ArrayList<Product>();
		
		for(int i = 1 ;i <= size;i++) {
			list.add(new Product(1981+(long)i,"Product"+i,"description"+i,(double) (100*i),i*i-i));
		}

		return list;
	}

}
