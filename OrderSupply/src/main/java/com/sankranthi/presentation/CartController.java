
package com.sankranthi.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.sankranthi.domain.Product;
import com.sankranthi.vo.Item;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class CartController implements Serializable {

	private List<Item> cartItems = new ArrayList<Item>();;

	@PostConstruct
	public void init() {

	}

	public void addItem(Item item) {
		if (item.getIqty() > 0 && item.getIqty() < 10) {
			cartItems.add(item);
			FacesMessage msg = new FacesMessage("Product added", "" + item.getP().getPname());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			FacesMessage msg = new FacesMessage("Quantity not correct", "" + item.getP().getPname());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

	}

	/**
	 * @return the cartItems
	 */
	public List<Item> getCartItems() {
		return cartItems;
	}

	/**
	 * @param cartItems
	 *            the cartItems to set
	 */
	public void setCartItems(List<Item> cartItems) {
		this.cartItems = cartItems;
	}

}
