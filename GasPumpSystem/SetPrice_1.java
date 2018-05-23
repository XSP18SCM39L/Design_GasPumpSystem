//SetPrice operation for gas pump 1
//Strategy pattern
public class SetPrice_1 extends SetPrice {
	
	public SetPrice_1(){
		
	}
	
	public void sp(DS ds, int g){

		if(g == 1) ds.setprice(ds.geta()); 
		if(g == 2) ds.setprice(ds.getb()); 

		System.out.println("-----Gas Selected-----");
	}

}
