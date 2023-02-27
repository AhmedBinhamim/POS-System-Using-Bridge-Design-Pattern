/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales_Tracking;

/**
 *
 * @author Hp
 */
public class PremiumCoupon implements CalculateDiscountedPrice{
    private int originalPrice;
    private int discountAmount;
    private int finalPrice;
    
   public PremiumCoupon(){}
    @Override
    public int calculateDiscountedPrice(int price){
        originalPrice = price;
        finalPrice = originalPrice - price * 20/100;;
        return finalPrice;
    }
    @Override
    public int getFinalPrice(){
        return finalPrice;
    }
    @Override 
    public int getDiscountAmount(int price){
        discountAmount = price * 20/100;
        return discountAmount;
    }
    
}
