package pizza;

public class PizzaStore {

	static SimplePizzaFactory factory;
	
	public PizzaStore() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}




	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza=factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
