//StoreCash operation for gas pump 2
//Strategy pattern
public class StoreCash_2 extends StoreCash{

	public StoreCash_2(){
		
	}
	
	public void sc(DS ds){
		int a = ds.getcash_temp();
		ds.setcash(a);
		System.out.print("-----CASH RECEIVED-----");
	}
}
