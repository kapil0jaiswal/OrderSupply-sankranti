package com.sankranthi.domain;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long pid;
	private String pname;
	private String description;
	private Double price;
	private Integer qty;

	public Product(Long pid, String pname, String description, Double price, Integer qty) {
		this.pid = pid;
		this.pname = pname;
		this.description = description;
		this.price = price;
		this.qty = qty;
	}

	/**
	 * @return the pid
	 */
	public Long getPid() {
		return pid;
	}

	/**
	 * @param pid
	 *            the pid to set
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname
	 *            the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the qty
	 */
	public Integer getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
