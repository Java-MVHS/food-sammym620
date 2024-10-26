// Sammy Mukkamala
// Period: 5
// Date: 10/24/24

// Tester class for Food and its subclasses, including Pizza and deepDishPizza
public class foodTester 
{
    // Main method to run the program
    public static void main(String[] args) 
    {
        System.out.println("\n\n\n");  // Print new lines for clearer output

        // Create Food instance representing baked banana muffins
        Food food1 = new Food("baked", "banana", "muffins");
        food1.printForSale();  // Print sale information for food1

        // Create Food instance representing fried yam fritters
        Food food2 = new Food("fried", "yam", "fritters");
        food2.printForSale();  // Print sale information for food2

        // Create Pizza instance representing a pepperoni pizza
        Pizza pizza = new Pizza("pepperoni");
        pizza.printForSale();  // Print sale information for pizza

        // Create deepDishPizza instance representing a deep dish pepperoni pizza
        deepDishPizza pizza2 = new deepDishPizza("pepperoni");
        pizza2.printForSale();  // Print sale information for deep dish pizza

        System.out.println("\n\n\n");  // Print new lines for clearer output
    }
}
