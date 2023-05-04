/*
 * Name: Bonita Li
 * File: MainController.java
 * Other Files in this Project:
 * 		index.html
 * 		order.html
 * 		main.css
 * 		Cheese.java
 * 		Units.java
 */
package ca.sheridancollege.libon.A1_libon.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ca.sheridancollege.libon.A1_libon.beans.Cheese;
import ca.sheridancollege.libon.A1_libon.beans.Units;

@Controller
public class MainController {
	
	@GetMapping("/index.*")
	public String indexPage() {
		return "index.html";
	}
	
	@GetMapping("/orderform")
	public String orderPage(){
		return "order.html";
	}
	
	@GetMapping("/submit")
	public void form(HttpServletResponse response,
			@RequestParam String name,
			@RequestParam int weight,
			@RequestParam double unitNumber,
			@RequestParam(defaultValue="WHEEL") Units units,
			@RequestParam double price,
			@RequestParam String specSheet) {
		Cheese cheese = new Cheese();
		cheese.setName(name);
		cheese.setUnitNumber(unitNumber);
		cheese.setUnits(units);
		cheese.setPrice(price);
		cheese.setSpecSheet(specSheet);
		
		try {
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>\n<html lang='en'>\n<head>\n<meta charset='UTF-8'>\n"
					+ "<title>Cheese Ordering</title>\n</head>\n<body>\n<h1>Cheese Order</h1>"
					+ "<div>" + cheese.toString() + "<br>Quantity: " + String.format("%.0f", unitNumber) 
					+ "<br>Total: $" + String.format("%.2f", cheese.calcTotal(unitNumber)) + "<br><br>"
					+ "<a href='/index.*'>Back to Sydney's Cheesey Cheese</a>" + "</div>\n</body>\n</html>");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
