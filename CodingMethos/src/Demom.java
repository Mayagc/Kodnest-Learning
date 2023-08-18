import java.util.Scanner;
public class Demom {
	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter the name and year of birth");
    String name=scan.next();
    greet(name);
    int age=scan.nextInt();
    int res=Age(age);
    System.out.println("you are "+res+" years old.");
    	
	}
    public static void greet( String name)
    {
    	System.out.println("hello" +name);
    }
    public static int Age(int Age)
    {
    	return 2023-Age;
    }
}
