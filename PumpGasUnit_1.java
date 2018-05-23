//PumpGasUnit operation for gas pump 1
//Strategy pattern
public class PumpGasUnit_1 extends PumpGasUnit {
	
	public PumpGasUnit_1(){//Pump gallon
		
	}
	
	public void pgu(DS ds){
		ds.setnum(ds.getnum()+1);
		ds.settotal(ds.getnum()*ds.getPrice());
		System.out.println(ds.getnum()+" GALLON PUMPED");
	}

}
