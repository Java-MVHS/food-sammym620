// Sammy Mukkamala
// Period: 5
// Date: 10/24/24

// Base class representing a general food item
public class Food3 
{
    protected String str;  // Made string for the food item
    protected int numPieces;  // Number of pieces of the food item
    protected double costPerPiece;  // Cost per piece of the food item

    // Default constructor
    public Food3() 
    {
        str = "";  // Initialize empty string
    }

    // Parameterized constructor to initialize food item with preparation method, ingredient, name, number of pieces, and cost per piece
    public Food3(String prepMethod, String ingredient, String name, int numPieces, double costPerPiece) 
    {
        this.str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
        this.numPieces = numPieces;
        this.costPerPiece = costPerPiece;
    }

    // Method to print the sale information for the food item
    public void printForSale() 
    {
        // Format the output string to show food item details and calculated total cost
        String formattedOutput = String.format("%s - Pieces: %d, Cost per piece: $%.2f, Total: $%.2f",
                str, numPieces, costPerPiece, numPieces * costPerPiece);
        System.out.println(formattedOutput);  // Print the formatted sale information
    }
}
