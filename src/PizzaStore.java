public class PizzaStore {
	// we give PizzaStore a reference to a
	// SimplePizzaFactory
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		// PizzaStore gets the factory passed to it
		// as a reference
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;

		// orderPizza method uses the factory to create its
		// pizza by simply passing the type of the order
		pizza = factory.createPizza(type);

        // notice that we have replaced the new operator
        // with a create method on the factory object.
        // No more concrete instantiations here
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
