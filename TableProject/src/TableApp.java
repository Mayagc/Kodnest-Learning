
public class TableApp {

	public static void main(String[] args) {
        Table t1=new Table();
        Table t2=new Table();
        
        t1.seatingcapacity=6;
        t1.cost=3500;
        t1.color="balck";
        t1.brand="Greenply";
        t1.allowToSit();
        t1.allowToWrite();
        System.out.println(t1.seatingcapacity+" "+t1.cost+" "+t1.color+" "+t1.brand);
        System.out.println("============================");
        
        t2.seatingcapacity=3;
        t2.cost=3000;
        t2.color="white";
        t2.brand="Greenply";
        t2.allowToSit();
        t2.allowToWrite();
        System.out.println(t2.seatingcapacity+" "+t2.cost+" "+t2.color+" "+t2.brand);
        System.out.println("============================");
        
             
	}

}
