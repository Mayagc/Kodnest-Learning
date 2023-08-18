import java.util.Scanner;
   public class TemperatureConverterApp {
	  public static void main(String []args) {
	  Scanner scan =new Scanner(System.in);
	  System.out.println("Enter user temparature in fahrenheit and convert to celsius ");
	  double f=scan.nextDouble();
	  TemperatureConverter t=new TemperatureConverter();
	  double res=t.converterFahrenhitToCelisius(f);
	  System.out.println(res);
	}

}

