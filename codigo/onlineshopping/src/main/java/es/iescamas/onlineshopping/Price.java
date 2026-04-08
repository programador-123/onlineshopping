package es.iescamas.onlineshopping;

public class Price {
	private Real moneda;
	
	public Price(Real moneda) {
		this.moneda = moneda;
	}

	public Real getMoneda() {
		return moneda;
	}

	public void setMoneda(Real moneda) {
		this.moneda = moneda;
	}
}
