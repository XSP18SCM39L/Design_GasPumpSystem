//Stop operation for gas pump 1
public class Stop_1 extends Stop{

	public Stop_1(){
		
	}
	
	public void stop(DS ds){
		System.out.println("-----PUMPING GAS STOPPED-----");
		System.out.println("Print the receipt:");
		System.out.println("Pumped Gallons: "+ ds.getnum());
		System.out.println("Total Price: "+ ds.gettotal());
	}
}
