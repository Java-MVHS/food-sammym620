// Sammy Mukkamala
// Period: 5
// Date: 10/24/24

// Class representing a Pizza, inheriting from Food3
public class Pizza3 extends Food3 
{
    // Constructor that accepts only ingredient, number of pieces, and cost per piece
    public Pizza3(String ingredientIn, int numPieces, double costPerPiece) 
    {
        // Call superclass constructor with default name "pizza"
        super("baked", ingredientIn, "pizza", numPieces, costPerPiece);
    }

    // Constructor that accepts ingredient, custom name, number of pieces, and cost per piece
    public Pizza3(String ingredientIn, String nameIn, int numPieces, double costPerPiece) 
    {
        // Call superclass constructor with provided name
        super("baked", ingredientIn, nameIn, numPieces, costPerPiece);
    }
}
