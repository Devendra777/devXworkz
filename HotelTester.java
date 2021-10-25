class HotelTester{

static  String []menuItems = {"Chicken Biryani","All Sweets","fish fry","Jamun","gobi","Paneer Fried Rice","Egg Fried Rice"};

public static void main(String a[]){



    HotelDTO dto = new HotelDTO() ; 
     dto.setHotelId(23);
    dto.setName("President Hotel");
   dto.setAddress("Hubli");
   dto.setMenuItems(menuItems);
  
System.out.println(dto) ;

    
   

}
}