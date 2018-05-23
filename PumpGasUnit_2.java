//PumpGasUnit operation for gas pump 2
//Strategy pattern
public class PumpGasUnit_2 extends PumpGasUnit{
	
	public PumpGasUnit_2(){//Pump liter
		
	}
	
	public void pgu(DS ds){
		
		if(ds.getcash()<ds.getPrice()*(ds.getnum()+1)){
			System.out.println("----No ENOUGH CASH AND GO TO STOP----");
		}else{
		ds.setnum(ds.getnum()+1);
		ds.settotal(ds.getnum()*ds.getPrice());
		System.out.println(ds.getnum()+" LITER PUMPED");
		}
	}

}
