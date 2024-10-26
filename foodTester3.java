// Tester class for Food3 and its subclasses, including Pizza3 and deepDishPizza3
public class foodTester3 {
    // Main method to run the program
    public static void main(String[] args) {
        System.out.println("\n\n\n");  // Print new lines for clearer output

        // Create Food3 instance representing baked banana muffins, set pieces and cost per piece
        Food3 food1 = new Food3("baked", "banana", "muffins", 12, 1.50);
        food1.printForSale();  // Print sale information for food1

        // Create Food3 instance representing fried yam fritters, set pieces and cost per piece
        Food3 food2 = new Food3("fried", "yam", "fritters", 8, 2.00);
        food2.printForSale();  // Print sale information for food2

        // Create Pizza3 instance representing a pepperoni pizza, set pieces and cost per piece
        Pizza3 pizza = new Pizza3("pepperoni", 10, 2.50);
        pizza.printForSale();  // Print sale information for pizza

        // Create deepDishPizza3 instance representing a deep dish pepperoni pizza, set pieces and cost per piece
        deepDishPizza3 pizza2 = new deepDishPizza3("pepperoni", 8, 3.00);
        pizza2.printForSale();  // Print sale information for deep dish pizza

        System.out.println("\n\n\n");  // Print new lines for clearer output
    }
}
