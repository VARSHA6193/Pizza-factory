
public class PizzaTestDrive 
{
    public static void main(String[] args) 
    {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println(pizza);

        pizza = store.orderPizza("clam");
        System.out.println(pizza);

        pizza = store.orderPizza("pepperoni");
        System.out.println(pizza);
    }
}
/*
Preparing Cheese Pizza
Baking Cheese Pizza
Cutting Cheese Pizza
Boxing Cheese Pizza
---- Cheese Pizza ----
Regular Crust
Marinara Pizza Sauce
Fresh Mozzarella
Parmesan

Preparing Veggie Pizza
Baking Veggie Pizza
Cutting Veggie Pizza
Boxing Veggie Pizza
---- Veggie Pizza ----
Regular Crust
Marinara sauce
Shredded mozzarella
Grated parmesan
Diced onion
Sliced mushrooms
Sliced red pepper
Sliced black olives

Preparing Clam Pizza
Baking Clam Pizza
Cutting Clam Pizza
Boxing Clam Pizza
---- Clam Pizza ----
Thin crust
White garlic sauce
Clams
Grated parmesan cheese

Preparing Pepperoni Pizza
Baking Pepperoni Pizza
Cutting Pepperoni Pizza
Boxing Pepperoni Pizza
---- Pepperoni Pizza ----
Thick Crust
Marinara sauce
Sliced Pepperoni
Sliced Onion
Grated parmesan cheese
*/

