class SocialMedia{
 String name ;
 String color ;
 boolean isInternetReq ;
 String ownerName;


public static void main(String a[]){

System.out.println( "Main method started" );

System.out.println( "In Process of creating Objects of SocialMedia(class)" );

       SocialMedia  socialMedia = new SocialMedia();
System.out.println(socialMedia);
       socialMedia.name ="Telegram";
      socialMedia.color = "whiteAndBlue";
    socialMedia.isInternetReq = true;
    socialMedia.ownerName = "Pavel Durov";
System.out.println( socialMedia.name + " "+  socialMedia.color + "  "+ socialMedia.isInternetReq + " "+
                  socialMedia.ownerName );

  SocialMedia  social = new SocialMedia();
System.out.println(social);
       social.name ="Instagram";
     social.color = "VIBGYOR";
   social.isInternetReq = true;
   social.ownerName = "Kevin Systrom";

System.out.println( social.name + " "+  social.color + "  "+  social.isInternetReq + " "+
                 social.ownerName );
  SocialMedia  sm = new SocialMedia();
System.out.println(sm);
       sm .name ="Snapchat";
      sm .color = "yellow&White";
      sm .isInternetReq = true;
     sm .ownerName = "Evan Spiegel";

System.out.println( sm.name + " "+  sm.color + "  "+  sm.isInternetReq + " "+
                 sm.ownerName );

System.out.println( "Main method ended" );
}

}