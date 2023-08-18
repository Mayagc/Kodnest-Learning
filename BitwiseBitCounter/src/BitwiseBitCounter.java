import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter an integer");
int num= scan.nextInt();
int count=countSetBits(num);
System.out.println("Number os set bits: "+count);
	}
	public static int countSetBits(int num)
	{
		int count = 0;
		while(num > 0) {
			if((num & 1)==1){
				count++;
			}
			num >>=1;
		}
		return count;
		
	}

}
