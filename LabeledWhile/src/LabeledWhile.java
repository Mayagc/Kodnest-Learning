
public class LabeledWhile {

	public static void main(String[] args) {
int i=1;
abcd:while(i<=5)
{
	int j=1;
	xyz:while(j<=5)
	{
		System.out.print("* ");
		i++;
		break abcd;
		
	}
	System.out.println();
	j++;
}

	}

}
