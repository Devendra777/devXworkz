class Speaker
{

static int maxVol=40;
static int currentVolume = 10 ; 


public static void main(String a[])
{
String brandName ="Ahuja";
  double price =10000.00;

System.out.println(brandName);
System.out.println(price);

increaseVolume();
increaseVolume();
}

public static void increaseVolume()
{
if(isConnected())
{
      if(currentVolume < maxVol)
{
currentVolume = currentVolume +1;
System.out.println("current volume is :" + currentVolume );
}

}
}

public static void decreaseVolume()
{

// code
}

public static boolean isConnected()
{
/*   return statement  */
return true;
}

}