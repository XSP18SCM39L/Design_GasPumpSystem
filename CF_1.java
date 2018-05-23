//abstract factory pattern for gas pump 1
//It will create gas pump 1's corresponding data, operation class
public class CF_1 extends AbstractFactory {
	DS_1 ds;
	StoreData_1 sd;
	PumpGasUnit_1 pgu;
	SetPrice_1 sp;
	PayMsg_1 pm;
	StoreCash_1 sc;
	DisplayMenu_1 dpm;
	Stop_1 st;
	
	public CF_1(){
		ds = new DS_1();
		sd = new StoreData_1();
		pgu = new PumpGasUnit_1();
		sp = new SetPrice_1();
		pm = new PayMsg_1();
		sc = new StoreCash_1();
		dpm = new DisplayMenu_1();
		st = new Stop_1();
	}

}
