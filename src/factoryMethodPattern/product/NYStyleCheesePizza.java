package factoryMethodPattern.product;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
