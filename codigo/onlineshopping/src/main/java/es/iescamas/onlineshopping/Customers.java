package es.iescamas.onlineshopping;
/**
 * @author Miguel
 */
public class Customers {
	private String id;
	private Address address;
	private Phone phone;
	private String email;
	
	public Customers() {
	}
	
	/**
	 * Clientes
	 * @param id 
	 * @param address
	 * @param phone
	 * @param email
	 */
	public Customers(String id, Address address, Phone phone, String email) {
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	/**
	 * 
	 * @return
	 */
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
