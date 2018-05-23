//StoreData operation for gas pump 2
//Strategy pattern
public class StoreData_2 extends StoreData {
	
	public StoreData_2(){
		
	}

	public void sd(DS ds){
		int a = ds.getaa_temp();
		int b = ds.getbb_temp();
		int c = ds.getcc_temp();
		ds.setaa(a);
		ds.setbb(b);
		ds.setcc(c);

		System.out.println("-----GASPUMP IS ACTIVATED AND GOTO START-----");
	}
}
