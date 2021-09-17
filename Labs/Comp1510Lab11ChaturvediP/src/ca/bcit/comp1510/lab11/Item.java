/**
 * 
 */

package ca.bcit.comp1510.lab11;

/**
 * Item Class.
 * 
 * @author Chaturvedi,Parth
 * @version 17-04-2021
 */
public class Item {
    
    /**
     * For the item name.
     */
    
    private final String name;
    
    /**
     * For the price of the item.
     */
    
    private final double price;
    
    /**
     * Item quantity.
     */
    
    private int quantity;
    
    Item(String iName, double iPrice, int iQuantity) {
        name = iName;
        price = iPrice;
        quantity = iQuantity;
    }
    
    Item(String iName, double iPrice) {
        name = iName;
        price = iPrice;
        quantity = 1;
    }
    
    /**
     * mutator for name.
     * @return name
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * mutator for price.
     * @return price
     */
    
    public double getPrice() {
        return price;
    }
    
    /**
     * mutator for quantity.
     * @return quantity
     */
    
    public int getQuantity() {
        return quantity;
    }

}
