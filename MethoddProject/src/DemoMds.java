import java.util.Scanner;
public class DemoMds {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter your name");
	  String name= scan.next();
	  Greet(name);
		
	}
	public static void Greet(String name)
	{
		System.out.println(" Hello "  + name +  " How are you...?");
	}

}
