//SetPrice operation for gas pump 2
//Strategy pattern
public class SetPrice_2 extends SetPrice{

     public SetPrice_2(){
		
	}
	
	public void sp(DS ds, int g){

		if(g == 1) ds.setprice(ds.getaa()); 
		if(g == 2) ds.setprice(ds.getcc()); 
		if(g == 3) ds.setprice(ds.getbb()); 

		System.out.println("-----Gas Selected-----");
	}
}
