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

public void getAllFoodItems(){
for(int i= 0 ; i < foodItems.length ; i++){
    if(foodItems[i] != null){
      System.out.println(foodItems[i].getFoodId() + "   "+  foodItems[i].getFoodName() + "   "+
                                             foodItems[i].getPrice() + "   "+   foodItems[i].getFoodType() );
}

}
}



    public  boolean updateFoodPriceByName(double price , String foodName ){
    System.out.println("inside updateFoodPriceByName()");
       boolean priceUpdated = false ;
        if(price > 0.0 && foodName != null){
              System.out.println("price is to be updated");
              for(int i=0 ; i  < foodItems.length ; i++)
               { 

                                  
                   if(foodItems[i].getFoodName().equals(foodName )){
                                       
                                  foodItems[i].setPrice(price);
                                  priceUpdated = true;     
                                                   
                     }

             }
       }
           return priceUpdated ; 

   }



     public boolean deleteFoodItemById(int id){
       System.out.println("inside deleteFoodItemById()");
        boolean isDeleted = false ; 
     for(int i= 0 ; i  < foodItems.length ; i++)
       {     
            if(foodItems[i] != null){
               
          if(foodItems[i].getFoodId() == id){
                            foodItems[i]= null;       
                        isDeleted  = true;
   
         }
}else{
      System.out.println("Food Items  got Deleted ");
        }


      }
           
       return isDeleted ;
     }




  public  FoodItemsDTO   getFoodItemByFoodId(int id){
   System.out.println("inside  getFoodItemByFoodId");
      FoodItemsDTO dto = null;
     for(int i = 0  ;  i < foodItems.length ; i++){
      if(id  > 0 ){
    
          if( foodItems[i].getFoodId() == id)
              dto        =      foodItems[i];
    
      }
    else {
System.out.println("id with " + id +  "   is not available");
   }
}
  return dto ; 
}

}