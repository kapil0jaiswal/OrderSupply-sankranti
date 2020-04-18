package com.sankranthi.vo;

import java.io.Serializable;

import com.sankranthi.domain.Product;

public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5868544753626497111L;
	Product p;
	int iqty;

	public Item(Product p, int iqty) {
		this.p = p;
		this.iqty = iqty;
	}

	/**
	 * @return the p
	 */
	public Product getP() {
		return p;
	}

	/**
	 * @param p
	 *            the p to set
	 */
	public void setP(Product p) {
		this.p = p;
	}

	/**
	 * @return the iqty
	 */
	public int getIqty() {
		return iqty;
	}

	/**
	 * @param iqty
	 *  the iqty to set
	 */
	public void setIqty(int iqty) {
		this.iqty = iqty;
	}

}
