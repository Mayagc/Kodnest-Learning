package com.Kodnest.methods.methodoverloading;

public class Disneychai {

	public static void main(String[] args) {
        teaBill();
        teaBill(10);
        teaBill("Ginger");
        teaBill("Green",10);
	}  

    public static void teaBill()
    {
    	System.out.println("Biil for tea is 10 Rs");
    }
    public static void teaBill(int n)
    {
    	System.out.println("Biil for "+n+" teas is" +(n*10)+"Rs");
    }
    public static void teaBill(String type)
    {
    	System.out.println("Biil for "+type+" tea is 15 Rs");
    }
    public static void teaBill(String type,int n)
    {
    	System.out.println("Biil for "+n+" "+type+" tea is" +(n*15));
    }
}
