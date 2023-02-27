# POS-System-Using-Bridge-Design-Pattern
This project implements a point-of-sale system using "Bridge" design pattern. 
The project focuses on how to build a system using object oritented methodology

I have picked the bridge design pattern because I want to
seperate implemention from the interface , which is my case the
way the system calculates the discount. The restaurant in the future
might have more than just bronze or couopon applied on the total 
amount , infact they might have variety of ways to do it so it will be 
easy to extend to those promotion types later by using bridge as
the implemention of food and drinks wont change only the implemention
of the way discount is calculated is enhanced you can say, by adding
a subclass of a new type of promotion using the calculateDiscounted
Price interface. Hence , this concludes that it improves the application
extensibility.


Let's say in the future , our client wants only to apply
discount for specific food and drinks, we can easily do that
by the getDiscountAmount method. This method will get
the specific discount for that specific food or drink item.
Also for more coupons, the calculatedDiscountPrice interface 
can be extended and a new subclass is implemented for the
new promotion.
