package es.iescamas.onlineshopping;

import java.util.Date;

public class Account {
	private String id;
	private Address billing_address;
	private Boolean is_closed;
	private Date open;
	private Date closed;
	private Customers customers;
	private Payment pago;
	private Order order;
	private ShoppingCart carrito;
	
	public Account(String id, Address billing_address, Boolean is_closed, Date open, Date closed, Customers customers,
			Payment pago, Order order, ShoppingCart carrito) {
		this.id = id;
		this.billing_address = billing_address;
		this.is_closed = is_closed;
		this.open = open;
		this.closed = closed;
		this.customers = customers;
		this.pago = pago;
		this.order = order;
		this.carrito = carrito;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(Address billing_address) {
		this.billing_address = billing_address;
	}

	public Boolean getIs_closed() {
		return is_closed;
	}

	public void setIs_closed(Boolean is_closed) {
		this.is_closed = is_closed;
	}

	public Date getOpen() {
		return open;
	}

	public void setOpen(Date open) {
		this.open = open;
	}

	public Date getClosed() {
		return closed;
	}

	public void setClosed(Date closed) {
		this.closed = closed;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Payment getPago() {
		return pago;
	}

	public void setPago(Payment pago) {
		this.pago = pago;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ShoppingCart getCarrito() {
		return carrito;
	}

	public void setCarrito(ShoppingCart carrito) {
		this.carrito = carrito;
	}
	
	
}
