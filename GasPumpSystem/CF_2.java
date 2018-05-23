//abstract factory pattern for gas pump 2
//It will create gas pump 1's corresponding data, operation class
public class CF_2 extends AbstractFactory {
	DS_2 ds;
	StoreData_2 sd;
	PumpGasUnit_2 pgu;
	SetPrice_2 sp;
	PayMsg_2 pm;
	StoreCash_2 sc;
	DisplayMenu_2 dpm;
	Stop_2 st;
	
	public CF_2(){
		ds = new DS_2();
		sd = new StoreData_2();
		pgu = new PumpGasUnit_2();
		sp = new SetPrice_2();
		pm = new PayMsg_2();
		sc =  new StoreCash_2();
		dpm = new DisplayMenu_2();
		st = new Stop_2();
	}

}
