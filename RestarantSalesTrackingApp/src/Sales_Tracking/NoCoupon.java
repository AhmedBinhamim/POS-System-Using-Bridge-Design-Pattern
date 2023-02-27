/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales_Tracking;

/**
 *
 * 
 */
public class NoCoupon implements CalculateDiscountedPrice{
    int originalPrice;
    int discountAmount;
    int finalPrice;
    
    public NoCoupon(){}
    @Override
    public int calculateDiscountedPrice(int price){
        originalPrice = price;
        finalPrice = originalPrice - 0;
        return finalPrice;
    }
    @Override
    public int getFinalPrice(){
        return finalPrice;
    }
    @Override 
    public int getDiscountAmount(int price){
        discountAmount = 0;
        return discountAmount;
    }
    
}