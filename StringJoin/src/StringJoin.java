import java.util.Scanner;
public class StringJoin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your first name and last name");
		String firstName=scan.next();
		String lastName=scan.next();
		System.out.println(joinString(firstName,lastName));

	}
	public static String joinString(String str1,String str2)
	{
	return str1+str2;
	}
}