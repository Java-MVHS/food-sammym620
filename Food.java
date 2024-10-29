// Sammy Mukkamala
// Period: 5
// Date: 10/24/24

// Base class representing a general food item
public class Food 
{
    protected String str;  // Description string for the food item

    // Default constructor
    public Food() 
    {
        str = "";  // Initialize empty string
    }

    // Made constructor to initialize food item with preparation method, ingredient, and name
    public Food(String prepMethod, String ingredient, String name) 
    {
        str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
    }

    // Method to print the sale information for the food item
    public void printForSale() 
    {
        System.out.println(str);  // Print the description of the food item
    }
}
