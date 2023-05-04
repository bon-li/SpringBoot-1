/*
 * Name: Bonita Li
 * File: Cheese.java
 * Other Files in this Project:
 * 		index.html
 * 		order.html
 * 		main.css
 * 		Units.java
 * 		MainController.java
 */
package ca.sheridancollege.libon.A1_libon.beans;

public class Cheese {
	private String name = "TBD";
	private double unitNumber = 1;
	private Units units;
	private double price = 25.00;
	private String specSheet = "";
	
	public Cheese () {
		
	}
	
	public Cheese (String name, double unitNumber, Units units, double price, String specSheet) {
		
	}
	
	public void setName(String name) {
		if(name.equals("")) {
			throw new IllegalArgumentException("Name cannot be blank.");
		} else {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setUnitNumber(double num) {
		if (num < 0) {
			throw new IllegalArgumentException("Number should be greater than 0.");
		} else {
			this.unitNumber = num;
		}
	}
	
	public double getUnitNumber() {
		return unitNumber;
	}
	
	public void setUnits(Units units) {
		this.units = units;
	}
	
	public Units getUnits() {
		return units;
	}
	
	public void setPrice(Double price) {
		if (price < 0 ) {
			throw new IllegalArgumentException("Price must be 0 or greater.");
		} else {
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setSpecSheet(String spec) {
		this.specSheet = spec;
	}
	
	public String getSpecSheet() {
		return specSheet;
	}
	
	public double calcTotal (double qty) {
		if(qty < 1) {
			return 0;
		} else {
			double total = price * qty;
			return total;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s, %.2f %s", name, unitNumber, units);
	}

}
