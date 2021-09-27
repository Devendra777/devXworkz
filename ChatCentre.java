class ChatCentre{

    String centreName ; 
    int centreId;
   String location ; 
   String ownerName ; 
   boolean  isOpen ; 
   String items[]  = {   "Pani Puri" ,"kachori","Samosa","Pav Bhaji", "Sandwich"};  

   public ChatCentre(){
  
System.out.println("ChatCentre object is created");
   this("Sai Chats" , "near KLE Ground"  , 2,  "Ranganath", true) ;
   }

   public ChatCentre(String centreName ,
                            String location  ,  int centreId , String ownerName , boolean isOpen ){
        this.centreName = centreName ; 
        this.location = location ; 
        this.items = items;
        this.centreId=  centreId ; 
       this.ownerName = ownerName ;   
       this.isOpen = isOpen ; 
}




public   void displayChatCentre(){
   System.out.println(this.centreName + "   "+  this.centreId + "  "+ this.ownerName + "  "+  this.location + "   "+  this.isOpen  );
}
    
  public void getItems(){
for(int i  = 0 ; i < this.items.length; i ++){
  System.out.println(this.items[i]);
     }
  }
   

}