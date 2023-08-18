import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter speed and time to distance");
    double speed=scan.nextDouble();
    double time =scan.nextDouble();
    JourneyCalculator journeyCalculator=new JourneyCalculator();
    double distance=journeyCalculator.calculatorDistance(speed, time);
    System.out.println(distance);
    
	}

}