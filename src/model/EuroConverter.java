package model;

public class EuroConverter {
	
	private double dollars;
	private double euros;
	public EuroConverter() {
		super();
	}
	public EuroConverter(double euros) {
		super();
		this.euros = euros;
		setDollars(euros);
	}
	public double getDollars() {
		return dollars;
	}
	public void setDollars(double dollars) {
		double currencyConverter = 1.105;
		this.dollars = dollars * currencyConverter;
	}
	public double getEuros() {
		return euros;
	}
	public void setEuros(double euros) {
		this.euros = euros;
	}
	@Override
	public String toString() {
		return "EuroConverter [dollars=" + dollars + ", euros=" + euros + "]";
	}
}
