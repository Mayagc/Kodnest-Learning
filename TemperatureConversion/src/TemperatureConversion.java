import java.util.Scanner;

public class TemperatureConversion {

	private static final double Fahrenheit = 0;

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("welcome to temperature conversion tool");
System.out.println("select an option 1. convert  celius to fahrenheit 2. convert fahrenheit to celsius ");
System.out.println("enter your choice:");
int option=scan.nextInt();
if(option==1)
{
	System.out.println("enter temparature in celsius:");
double celius=scan.nextDouble();
double res1=DempApp.converterCelisiusToFahrenheit(celius);
System.out.println(res1); 
}
else if(option==2){
	System.out.println("enter temparature in celsius:");
	double celius=scan.nextDouble();
	double res2=DempApp.converterFahrenheitToCelisius(Fahrenheit);
	System.out.println(res2); 
}
else
{
	System.out.println("invalid option");
}
	}

}
