package es.iescamas.onlineshopping;

public class LineItem {
	private Integer quantity;
	private Price price;
	private Order order;
	private ShoppingCart carrito;
	
	public LineItem(Integer quantity, Price price, Order order, ShoppingCart carrito) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.order = order;
		this.carrito = carrito;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Price getPrice() {
		return price;
	}

	public Order getOrder() {
		return order;
	}

	public ShoppingCart getCarrito() {
		return carrito;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setCarrito(ShoppingCart carrito) {
		this.carrito = carrito;
	}
	
	
}
