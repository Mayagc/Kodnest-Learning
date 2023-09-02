import java.util.Scanner;

public class MainM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0 || j==n||(i==j  && j<=4||j==n-i && i<=4))
				
				{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
			}
			System.out.println();

		}
	}

}
