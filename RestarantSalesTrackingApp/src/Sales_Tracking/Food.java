/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales_Tracking;

/**
 *
 * @author Hp
 */
public class Food extends Order{
    private int price;
    private int discountAmount;
    
    
    public Food(String itemName, int price, CalculateDiscountedPrice discountPrice){
        super(itemName, discountPrice);
        this.price = price;
        
    }
    
    public int getPrice(){
        return price;
    }
    
    @Override
    public int calculatePrice(){
        int finalPrice;
        finalPrice = discountPrice.calculateDiscountedPrice(price);
        discountAmount = discountPrice.getDiscountAmount(price);
        return finalPrice;
    }
    
    @Override
    public String getItemName(){
        return itemName;
    }
     @Override
    public int getDiscountAmount(){
        return discountAmount;
    }
}