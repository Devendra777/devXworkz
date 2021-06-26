class Country{

String name;
int noOfStates;
long population;
int noOfUnionTerritories;

public Country(String nm , int noOfStes ,  long pn , int noOfUnTet){
 name=nm;
noOfStates = noOfStes;
population = pn ;
noOfUnionTerritories=noOfUnTet;

}

public static void country()
{
System.out.println("");
}

public void printCountryDetails(){
 System.out.println(name + " "+ noOfStates + "  "+ population + " "+
                 noOfUnionTerritories);
}


public static void develop()
{
System.out.println("developing something");
}

}