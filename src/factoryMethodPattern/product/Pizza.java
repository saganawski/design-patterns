package factoryMethodPattern.product;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ... ");
		System.out.println("Adding sauce ...");
		System.out.println("Adding toppings");
		
		for(String top : toppings) {
			System.out.println(" " + top);
		}
		
	}
	
	public void bake() {
		System.out.println("Bake for 25 mins at 350");
	}
	
	public void cut() {
		System.out.println("Cutting pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
}
