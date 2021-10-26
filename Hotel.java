class Hotel{


 public FoodItemsDTO[] foodItems ;
private int  index  ;

public  Hotel(int size){

foodItems = new   FoodItemsDTO[size];
}
    
public boolean addFoodItems(FoodItemsDTO foodItems ){
   boolean isAdded = false;
 System.out.println("inside addFoodItems()");
 if(foodItems != null){
  System.out.println("got the food item");
this.foodItems[index++]  =      foodItems;
    isAdded =true;
 }
 else {
 System.out.println("cannot add  Food Items ");
}
return isAdded ; 
}

public void getFoodItems(){
for(int i= 0 ; i < foodItems.length ; i++){
      System.out.println(foodItems[i].getFoodId() + "   "+  foodItems[i].getFoodName() + "   "+
                                             foodItems[i].getPrice() + "   "+   foodItems[i].getFoodType() );
}
}

}