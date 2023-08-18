import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the purchase amount");
double purchaseamount=scan.nextDouble();
System.out.println("enter the tax rate (in decimal form)");
double taxrate=scan.nextDouble();
DemoApp d1=new DemoApp();
double totalamount=d1.calculateTotalWithTax(purchaseamount, taxrate);
System.out.println("Total cost including tax:"+totalamount);
}

}

