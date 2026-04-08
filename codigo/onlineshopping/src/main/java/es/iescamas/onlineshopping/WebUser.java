package es.iescamas.onlineshopping;

public class WebUser {
	private String id_login;
	private String password;
	private UserState state;
	private ShoppingCart carrito;
	
	public WebUser() {
	}

	public WebUser(String id_login, String password, UserState state, ShoppingCart carrito) {
		this.id_login = id_login;
		this.password = password;
		this.state = state;
		this.carrito = carrito;
	}
	
	public ShoppingCart getCarrito() {
		return carrito;
	}

	public void setCarrito(ShoppingCart carrito) {
		this.carrito = carrito;
	}

	public String getId_login() {
		return id_login;
	}

	public void setId_login(String id_login) {
		this.id_login = id_login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserState getState() {
		return state;
	}

	public void setState(UserState state) {
		this.state = state;
	}
	
	
}
