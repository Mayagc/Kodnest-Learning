
public class MainY {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i==j&& i<=3) ||( i+j==9 & i<=4) || (j==5 && i>4))
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
