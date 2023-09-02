
public class MainG {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0||(i==3 && j>2)||(i==4&&j==5)||i==n)
				
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
