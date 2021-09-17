/**
 * 
 */

package ca.bcit.comp1510.lab11;

/**
 * Transaction Class.
 * 
 * @author Chaturvedi,Parth
 * @version 17-04-2021
 */

public class Transaction {
    
    /**
     * Cart array.
     */

    private Item[] cart;
    
    /**
     * Total Price.
     */
    
    private double totalPrice;
    
    /**
     * Item count.
     */
    
    private int itemCount;
    
    Transaction(int size) {
        cart = new Item[size];
        totalPrice = 0;
        itemCount = 0;
    }
    
    /**
     * Adds item to cart.
     * @param itemName name
     * @param itemPrice price
     * @param quantity quantity
     */
    
    public void addToCart(String itemName, double itemPrice, int quantity) {
        cart[itemCount++] = new Item(itemName, itemPrice, quantity);
        totalPrice += quantity * itemPrice;
    }
    
    /**
     * Adds item to cart.
     * @param item Item object.
     */
    
    public void addToCart(Item item) {
        cart[itemCount++] = new Item(item.getName(), item.getPrice(),
                item.getQuantity());
        totalPrice += item.getQuantity() * item.getPrice();
    }
    
    /**
     * the total price.
     * @return totalPrice
     */
    
    public double getTotalPrice() {
        return totalPrice;        
    }
    
    /**
     * the item count.
     * @return itemCount
     */
    
    public int getCount() {
        return itemCount;
    }
}
