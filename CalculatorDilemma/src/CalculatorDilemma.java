import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("enter a number");
int num=scan.nextInt();
 int num1 =12;
int  num2 =10;
switch(num)
{

case 1:
	System.out.println("Addition result is: "+(num1+num2));
	break;
case 2:
	System.out.println("Substraction  result is:"+(num1-num2));
	break;
case 3:
	System.out.println("Multplication result sis: "+(num1*num2));
	break;
case 4:
	System.out.println("division result is:"+(num1/num2));
	break;
default :
	System.out.println("idiot .. go to vassan eye care");
	
}
	
}
}
	
