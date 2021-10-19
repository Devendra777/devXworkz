class Airport{

   public int airportId ; 
  public String airportName ; 
  public String location;

  public Terminal  terminals;
   
public Airport (){
System.out.println(this.getClass().getSimpleName() +" Object is created ");
}


public void setAirportId(int airportId){
this.airportId = airportId ; 
}

public void setAirportName(String  airportName){
this. airportName =  airportName ; 
}


public void setLocation(String location){
this.location = location ; 
}

public void setTerminals(Terminal terminals){
this.terminals = terminals ; 
}

@Override
public String toString(){
return "Airport - [airportId = "+  this.airportId+" , Airport Name = "+ this.airportName+" , location = "+ this.location+" , Terminal = "+this.terminals+"]";
}


}