import java.util.Scanner;

class HotelUtil{



public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size");
       int size    =  sc.nextInt();
          Hotel hotel = new Hotel(size);
  
     FoodItemsDTO dto  = new FoodItemsDTO();
          dto.setFoodId(1);
          dto.setFoodName("Pasta");
          dto.setPrice(106.00);
          dto.setFoodType("Chinese");

     
hotel.addFoodItems(dto);

   hotel.getFoodItems();
       

}


}