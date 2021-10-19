class AirportTester{


public static void main(String a[]){

 Airport airport  = new Airport ();
   airport .setAirportId(345);
  airport.setAirportName("KIA");
  airport .setLocation("near Devannahalli") ; 

Terminal terminal = new Terminal();
  terminal.terminalId = 90;
terminal.name = "TERMINAL-1";

  airport .setTerminals(terminal );

System.out.println(airport);

}


}