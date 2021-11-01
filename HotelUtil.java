import java.util.Scanner;

class HotelUtil{



public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size");
       int size    =  sc.nextInt();
          Hotel hotel = new Hotel(size);
  FoodItemsDTO dto1 ;
      for(int i = 0 ; i < size ; i++){
     dto1 = new FoodItemsDTO();
  System.out.println("Enter the id");
          dto1.setFoodId(sc.nextInt());
 System.out.println("Enter the  Food Name");
          dto1.setFoodName(sc.next());
 System.out.println("Enter the  Food Price");
          dto1.setPrice(sc.nextDouble());
 System.out.println("Enter the  Food type");
          dto1.setFoodType(sc.next());

         hotel.addFoodItems(dto1);
     }


 String text = null ;
   do{
     System.out.println("Press 1 to get all Food Items");
   System.out.println(" Press 2   to Update Food Price By Name");
    System.out.println("Press 3   to Delete Food Item By id");
   System.out.println("Press 4 to fetch Food Item by  id") ;

       int choice =   sc.nextInt();
    
switch(choice){
      case 1  :      hotel.getAllFoodItems();
      break;
      case 2  :   System.out.println("Enter the food Name to update Price");
                        String foodName = sc.next();
                        System.out.println("Enter the Updated Price ");
                       double price = sc.nextDouble();
                       boolean isUpdated =  hotel. updateFoodPriceByName(price , foodName) ; 
                       System.out.println("Price is Updated "+isUpdated);
      break ; 

   case 3  :    System.out.println("Enter the  Id to delete Food Item");
                     hotel.deleteFoodItemById(sc.nextInt());
     break ; 
   case 4  :   System.out.println("Enter the  Id to get Food Item");
    FoodItemsDTO   dto  =    hotel. getFoodItemByFoodId(sc.nextInt()) ; 
      if(dto != null){
              System.out.println(dto.getFoodId() + "   "+ dto.getFoodName()  + "  "+  dto.getPrice() + "  "+ dto .getFoodType());
       }
else{
         System.out.println("No Food Found");
    }
   break ; 
    default :   System.out.println("Wrong Choice ...... ");
 break  ; 
}
   
  System.out.println(" Do u want to continue ?  Y/N");
   text =  sc.next();
 }while(text.equals("Y")) ;
  
  System.out.println("Thank you for Using the Food Items Application");


}


}