import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your first name and last name");
		String str1= scan.next();
		String str2= scan.next();
		System.out.println(joinString(str1,str2));

	}
	public static String joinString(String str1, String str2)
	{
		return str1+str2;
	}

}
