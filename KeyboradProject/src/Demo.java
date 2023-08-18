import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter Student First Name");
        String a=scan.next();
        System.out.println("value is a " +a);
        System.out.println("enter Student Last Name");
        String b=scan.next();
        System.out.println("value is b " +b);
        System.out.println("enter Student gender");
        String d=scan.next();
        System.out.println("value is d " +d);
        System.out.println("enter Student maried ? say true or false");
        boolean e=scan.nextBoolean();
        System.out.println("value is e " +e);
        System.out.println("enter Student Branch");
        String f=scan.next();
        System.out.println("value is f " +f);
        System.out.println("enter Student Height");
        float g=scan.nextFloat();
        System.out.println("value is g " +g);
        System.out.println("enter Student weight");
        float h=scan.nextFloat();
        System.out.println("value is h " +h);
	}

}
