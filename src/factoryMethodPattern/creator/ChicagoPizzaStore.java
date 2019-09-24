package factoryMethodPattern.creator;

import factoryMethodPattern.product.ChicagoStyleCheesePizza;
import factoryMethodPattern.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if(type.equalsIgnoreCase("Cheese")) {
			return new ChicagoStyleCheesePizza();
		}else {
			return null;			
		}
	}

}
