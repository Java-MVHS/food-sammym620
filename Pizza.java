// Sammy Mukkamala
// Period: 5
// Date: 10/24/24

// Class representing a Pizza, inheriting from Food
public class Pizza extends Food 
{
    // Constructor that accepts only ingredient and uses "pizza" as default name
    public Pizza(String ingredientIn) 
    {
        super("baked", ingredientIn, "pizza");
    }

    // Constructor that accepts ingredient and a custom name for the pizza
    public Pizza(String ingredientIn, String nameIn) 
    {
        super("baked", ingredientIn, nameIn);
    }
}
