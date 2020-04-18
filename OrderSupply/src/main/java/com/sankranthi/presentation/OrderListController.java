package com.sankranthi.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.sankranthi.domain.Product;
import com.sankranthi.service.OrderService;
import com.sankranthi.vo.Item;

@ManagedBean
@SessionScoped
public class OrderListController implements Serializable{

	/**
	 * serialVersionUID .
	 */
	private static final long serialVersionUID = -3203913417443570396L;
	
	private List<Item> item =new ArrayList<Item>();
	
	
	//service injecting for getting List of products.
	@Inject
	private OrderService service;

	/**
	 * Initialize item consisting product with there quantity.
	 */
	@PostConstruct
	public void init() {
		List<Product> prod;
		System.out.println("orderListController enabled");
		prod = service.createProduct(10);
		
		for (Product p : prod) {
			item.add(new Item(p,0));
		}
	}

	
	/**
	 * @return the item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	

}
