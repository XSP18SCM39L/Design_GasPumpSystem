//StoreData operation for gas pump 1
//Strategy pattern
public class StoreData_1 extends StoreData{
	
	public StoreData_1(){
		
	}
	
	public void sd(DS ds){
		float a = ds.getat();
		float b = ds.getbt();
		ds.seta(a);
		ds.setb(b);

		System.out.println("-----GASPUMP IS ACTIVATED AND GOTO START-----");
	}

}
