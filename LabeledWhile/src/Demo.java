
public class Demo {

	public static void main(String[] args) {
int i=1;
abcd: do {
	int j=1;
	xyz: do {
		System.out.print("* ");
		j++;
		break abcd;
	}while(j<=5);
	
	}while(i<=5);

System.out.println();
i++;
}
}


