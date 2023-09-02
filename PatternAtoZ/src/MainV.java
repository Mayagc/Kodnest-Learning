

public class MainV {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==j||j+i==n)
				
				{
			System.out.print(" *");
		}
		else
		{
			System.out.print("  ");
		}
			}
			System.out.println();

		}
	}

}
