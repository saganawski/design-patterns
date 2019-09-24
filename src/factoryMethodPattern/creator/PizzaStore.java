package factoryMethodPattern.creator;

import factoryMethodPattern.product.Pizza;

public abstract class PizzaStore {
	
	public Pizza oderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);

}
