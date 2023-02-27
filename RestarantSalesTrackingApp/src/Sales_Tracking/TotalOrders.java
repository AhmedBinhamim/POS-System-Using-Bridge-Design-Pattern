/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales_Tracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class TotalOrders extends Order{
    private List<Order> orderList = new ArrayList<Order>();
    private int totalPrice;
    private int discountAmount;
    private int finalPrice;
    
    
    public TotalOrders(List <Order> orderList, String itemName, CalculateDiscountedPrice discountPrice ){
        super(itemName, discountPrice);
        for (int i = 0; i < orderList.size(); i++){
            this.orderList.add(orderList.get(i));
            totalPrice += orderList.get(i).getPrice();
        }
    }
    
    @Override
    public int calculatePrice(){
        finalPrice = discountPrice.calculateDiscountedPrice(totalPrice);
        
        
        
        return finalPrice;
    }
    @Override
    public int getPrice(){
        return totalPrice;
    }
    @Override
    public String getItemName(){
        return itemName;
    }
    @Override
    public int getDiscountAmount(){
        discountAmount = discountPrice.getDiscountAmount(totalPrice);
        return discountAmount;
    }
}
