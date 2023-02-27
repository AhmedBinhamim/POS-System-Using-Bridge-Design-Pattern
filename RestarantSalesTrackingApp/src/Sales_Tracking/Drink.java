/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales_Tracking;

/**
 *
 * @author Hp
 */
public class Drink extends Order{
    private int price;
    private int discountAmount;
    
    
    
    public Drink(int price,String itemName, CalculateDiscountedPrice discountPrice){
        super(itemName, discountPrice);
        this.price = price;
    }
    
    @Override
    public int calculatePrice(){
        int finalPrice;
        finalPrice = discountPrice.calculateDiscountedPrice(price);
        return finalPrice;
    }
    
     @Override
    public int getPrice(){
        return price;
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