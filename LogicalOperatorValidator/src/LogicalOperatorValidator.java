import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		boolean isInputValid = true;
		boolean meetCertainCondition = true;
Scanner scan=new Scanner(System.in);
boolean isValid = isValidInput(isInputValid, meetCertainCondition);

System.out.println("is input valid (true/false):" +isInputValid);
System.out.println("Does input meet  a certain condtion (true/false)");
if (isValid) {
	System.out.println("Input is valid.");
  }
else {
	  System.out.println("input is not valid.");
	  
	}

	}
	public static boolean isValidInput(boolean isInputValid, boolean meetCertainCondition)
	{
	boolean isValid = isInputValid && meetCertainCondition;
	return isValid;
	}

}
