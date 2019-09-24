package factoryMethodPattern;

import factoryMethodPattern.creator.ChicagoPizzaStore;
import factoryMethodPattern.creator.NYpizzaStore;
import factoryMethodPattern.creator.PizzaStore;
import factoryMethodPattern.product.Pizza;

public class PizzaMaker {

	public static void main(String[] args) {
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore nyStore = new NYpizzaStore();
		
		Pizza pizza = nyStore.oderPizza("Cheese");
		System.out.println("Kyle order a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.oderPizza("cheese");
		System.out.println("Tony order a " + pizza.getName() + "\n");
	}

}
