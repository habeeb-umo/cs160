// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class McDonalds {

    // Enumerations
    public enum SodaFlavor { Nothing, Coke, Pepsi, Sprite };
    public enum SodaSize { Nothing, Small, Medium, Large };
    public enum Sandwich { Nothing, BigMac, QuarterPounder, FiletOfFish };
    public enum SideOrder { Nothing, FrenchFries, OnionRings };
    
    // Instance variables
    // Add requested variables!!!
    private SodaFlavor sodaFlavor;
    private SodaSize sodaSize;
    private Sandwich sandwich;
    private SideOrder side;

    // Constructor
    public McDonalds() {
        sodaFlavor = SodaFlavor.Nothing;
        sodaSize = SodaSize.Nothing;
        sandwich = Sandwich.Nothing;
        side = SideOrder.Nothing;
    }

    // Entry point with test code
    public static void main(String[] args) {
        
        McDonalds myMeal = new McDonalds();
        myMeal.chooseDrink(SodaFlavor.Coke, SodaSize.Medium);
        myMeal.chooseMeal(Sandwich.QuarterPounder, SideOrder.OnionRings);
        System.out.println(myMeal.toString());

        McDonalds specialMeal = new McDonalds();
        specialMeal.chooseDrink(SodaFlavor.Coke, SodaSize.Medium);
        specialMeal.chooseMeal(Sandwich.BigMac, SideOrder.FrenchFries);
        System.out.println(specialMeal.toString());

        McDonalds noDrink = new McDonalds();
        noDrink.chooseDrink(SodaFlavor.Nothing, SodaSize.Nothing);
        noDrink.chooseMeal(Sandwich.FiletOfFish, SideOrder.FrenchFries);
        System.out.println(noDrink.toString());
    }

    // Setters
    public void chooseDrink(SodaFlavor flavor, SodaSize size) {
        sodaFlavor = flavor;
        sodaSize = size;
    }
    public void chooseMeal(Sandwich type, SideOrder order) {
        sandwich = type;
        side = order;
    }
    
    // Print order
    public String toString() {
        
        // Compute cost
        double cost = calculateCost();
        
        // Create output
        String s;

        // Add code to build string!!!
        s = "Drink Flavor: " + sodaFlavor +
        	"\nDrink Size: " + sodaSize +
        	"\nSandwich Type: " + sandwich +
        	"\nSide Order: " + side + 
        	"\nCost of Order: $" + cost;
        	
        
        //case 
        
        return s;
    }
    
    // Calculate cost
    public double calculateCost() {

        double cost = 0.0;

        // Add special meal!!!
        if(sodaSize == SodaSize.Medium && sandwich == Sandwich.BigMac && side == side.FrenchFries)
        return 4.39;
        // Compute soda cost
        switch (sodaSize) {
        case Small:  cost += 0.79; break;
        case Medium: cost += 0.99; break;
        case Large:  cost += 1.19; break;
        default:
        }
        
        // Compute sandwich cost
        switch (sandwich) {
        case BigMac: cost += 3.79; break;
        case QuarterPounder: cost += 4.09; break;
        case FiletOfFish: cost += 2.89; break;
        default:
        }

        // Compute side cost
        if (side != SideOrder.Nothing) {
            cost += 1.59;
        }
        return cost;
    }
}


