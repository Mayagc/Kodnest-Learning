
public class incanddec {

	public static void main(String[] args) {
       int a=10;
       int b;
       //b=a++ + a++ + a++;
       //System.out.println(a);
       //System.out.println(b);
       //b=++a + ++a + ++a;
       //System.out.println(a);
       //System.out.println(b);
       //b=a++ + a-- + --a + a++;
       //System.out.println(a);
       //System.out.println(b);
       b=a++ + --a + a++ + ++a + --a;
       System.out.println(a);
       System.out.println(b);
	}

}
