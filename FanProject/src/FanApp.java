
public class FanApp {

	public static void main(String[] args) {

       Fan f1 =new Fan();
       Fan f2 =new Fan();
       Fan f3 =new Fan();
       
       f1.no_of_wings=3;
       f1.color="white";
       f1.cost=3500;
       f1.brand="Cropton";
       System.out.println(f1.no_of_wings+ " " +f1.color+ " " +f1.cost+ " "+f1.brand);   
       f1.fanRotate();
       f1.fanBlow_Air();
       
       f2.no_of_wings=4;
       f2.color="block";
       f2.cost=3400;
       f2.brand="usha";
       System.out.println(f2.no_of_wings + " " +f2.color+ " " +f2.cost+ " "+f2.brand);
       f2.fanRotate();
       f2.fanBlow_Air();
       
       f3.no_of_wings=5;
       f3.color="blue";
       f3.cost=3000;
       f3.brand="orient";
       System.out.println(f3.no_of_wings + " " +f3.color+ " " +f3.cost+ " "+f3.brand);
       f3.fanRotate();
       f3.fanBlow_Air();
       


	}

}
