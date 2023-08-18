
public class Demo1 {

	public static void main(String[] args) {
		int i=10;
		mnop: do {
			int j=1;
			pqrs: do {
				System.out.print("* ");
				j++;
				break mnop;
			}while(j<=15);
			
			}while(i<=15);

		System.out.println();
		i++;
		}
	}


