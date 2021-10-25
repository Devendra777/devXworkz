public class HotelDTO{

public HotelDTO(){
System.out.println("HotelDTO object is created ");
}

private int hotelId  ;
private String name ;
private String address;
private String[] menuItems ;

public int getHotelId(){
return hotelId ; 
}

public void setHotelId(int hotelId){
this.hotelId =  hotelId;
}

public String getName(){
return name ; 
}

public void setName(String name){
this.name = name ; 
}

public String getAddress(){
return address ;
}

public void setAddress(String address){
this.address = address ; 
}

public String[]  getMenuItems(){
return menuItems ;
}

public void   setMenuItems (String[] menuItems){
this.menuItems = menuItems ; 
}

@Override
public String toString(){
return "HotelDTO -[hotelId = "+this.hotelId+" , name = "+ this.name+", address = " +  this.address+"]" ;
}

}