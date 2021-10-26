public class FoodItemsDTO  {

   private int foodId;
   private String foodName;
   private double price;
   private String foodType;
 
   public FoodItemsDTO(){
System.out.println("FoodItemsDTO object is created");
}


  public int getFoodId(){
return foodId;
}

public void setFoodId(int foodId){
 this.foodId= foodId;
}


  public String getFoodName(){
return foodName;
}

public void setFoodName(String foodName){
 this.foodName= foodName;
}


  public double getPrice(){
return price;
}

public void setPrice(double price){
 this.price= price;
}


  public String  getFoodType(){
return foodType;
}

public void setFoodType(String  foodType){
 this.foodType= foodType;
}


}