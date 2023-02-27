/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales_Tracking;

/**
 *
 * @author Hp
 */
public abstract class Order{
    protected CalculateDiscountedPrice discountPrice;
    protected String itemName;
    
    
    
    protected Order(String itemName, CalculateDiscountedPrice discountPrice){
        this.itemName = itemName;
        this.discountPrice = discountPrice;
    }
    
    public abstract int calculatePrice();
    public abstract int getPrice();
    public abstract String getItemName();
    public abstract int getDiscountAmount();
}
