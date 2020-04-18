package com.sankranthi.presentation;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.primefaces.event.RowEditEvent;
import com.sankranthi.domain.Product;
import com.sankranthi.service.OrderService;

@ManagedBean
@SessionScoped
public class OrderController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long pid;
	private String pname;
	private String description;
	private Double price;
	private Integer qty;
	private Integer cartqty;
	private List<Product> prod;
	private List<Product> filterProd;

	@Inject
	private OrderService service;

	@PostConstruct
	public void init() {
		System.out.println("orderController enabled");
		prod = service.createProduct(10);

	}

	public String addAction() {
		Product vo = new Product(this.pid, this.pname, this.description, this.price, this.qty);
		prod.add(vo);

		pid = (long) (1981*prod.size()+1);
		pname = "";
		description = "";
		price = 0.0;
		qty = 0;
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean filterByPrice(Object value, Object filter, Locale locale) {
		String filterText = (filter == null) ? null : filter.toString().trim();
		if (filterText == null || filterText.equals("")) {
			return true;
		}

		if (value == null) {
			return false;
		}

		return ((Comparable) value).compareTo(getInteger(filterText)) > 0;
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Product Edited", "" + ((Product) event.getObject()).getPid());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled", "" + ((Product) event.getObject()).getPid());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void delete(Product p) {
		prod.remove(p);
	}

	public boolean globalFilterFunction(Object value, Object filter, Locale locale) {
		String filterText = (filter == null) ? null : filter.toString().trim().toLowerCase();
		if (filterText == null || filterText.equals("")) {
			return true;
		}
		int filterInt = getInteger(filterText);

		Product car = (Product) value;
		return car.getPid() < filterInt || car.getPname().toLowerCase().contains(filterText)
				|| car.getDescription().toLowerCase().contains(filterText) || car.getQty() < filterInt
				|| car.getPrice() < filterInt;
	}

	private int getInteger(String string) {
		try {
			return Integer.valueOf(string);
		} catch (NumberFormatException ex) {
			return 0;
		}
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	/**
	 * @return the prod
	 */
	public List<Product> getProd() {
		return prod;
	}

	/**
	 * @param prod
	 *            the prod to set
	 */
	public void setProd(List<Product> prod) {
		this.prod = prod;
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
	 * @return the filterProd
	 */
	public List<Product> getFilterProd() {
		return filterProd;
	}

	/**
	 * @param filterProd
	 *            the filterProd to set
	 */
	public void setFilterProd(List<Product> filterProd) {
		this.filterProd = filterProd;
	}

	/**
	 * @return the cartqty
	 */
	public Integer getCartqty() {
		return cartqty;
	}

	/**
	 * @param cartqty the cartqty to set
	 */
	public void setCartqty(Integer cartqty) {
		this.cartqty = cartqty;
	}

	/* search methods are added */

}
