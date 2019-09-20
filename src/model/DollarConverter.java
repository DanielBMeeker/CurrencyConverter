package model;

public class DollarConverter {
	private double dollars;
	private double euros;
	public DollarConverter() {
		super();
	}
	public DollarConverter(double dollars) {
		super();
		this.dollars = dollars;
		setEuros(dollars);
	}
	
	public double getDollars() {
		return dollars;
	}
	public void setDollars(double dollars) {
		this.dollars = dollars;
	}
	public double getEuros() {
		return euros;
	}
	public void setEuros(double euros) {
		double currencyConverter = .905;
		this.euros = euros * currencyConverter;
	}
	@Override
	public String toString() {
		return "CurrencyConverter [dollars=" + dollars + ", euros=" + euros + "]";
	}
	
}
