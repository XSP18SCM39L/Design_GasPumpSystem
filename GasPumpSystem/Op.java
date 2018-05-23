//OP class for the MDS_EFSM model
//Strategy pattern
public class Op {
	StoreData sd;
	PayMsg pm;
	PumpGasUnit pgu;
	SetPrice sp;
	StoreCash sc;
	DisplayMenu dpm;
	Stop st;
	DS ds;
	
	public Op(){
		
	}
	
	public void initialize(StoreData sd, PayMsg pm, StoreCash sc, DisplayMenu dpm, PumpGasUnit pgu, SetPrice sp, Stop st, DS ds){
		this.sd = sd;
		this.pgu = pgu;
		this.ds = ds;
		this.sp = sp;
		this.pm = pm;
		this.sc = sc;
		this.dpm = dpm;
		this.st = st;
	}
	
	
	////All meta actions for MDA_EFSM model
	public void StoreData(){
		sd.sd(ds);	
	}
	
	public void PayMsg(){
		pm.pm();
	}
	
	public void StoreCash(){
		sc.sc(ds);
	}
	
	public void DisplayMenu(){
		dpm.dpm();
	}
	
	public void RejectMsg(){
		System.out.println("-----REJECT CREDIT CARD-----");
	}
	
	public void CancelMsg(){
		System.out.println("-----CANCEL IT NOW-----");
	}
	
	public void SetPrice(int g){
		sp.sp(ds, g);	

	}

	public void ReadyMsg(){
		System.out.println("-----GAS PUMP READY-----");
	}
	
	public void SetInitial(){
		ds.setnum(0);
		ds.settotal(0);
	}
	
	public void PumpGasUnit(){
		pgu.pgu(ds);
	}
	
	public void GasPumpedMsg(){
		System.out.println("");
	}
	
	public void StopMsg(){
		st.stop(ds);
	}
	
	public void PrintReceipt(){
		System.out.println("Print the receipt:");
		System.out.println("Pumped Volume "+ ds.getnum());
		System.out.println("Total Price "+ ds.gettotal());
	}
	
	public void ReturnCash(){
		System.out.println("-----CASH RETURNED-----");
		System.out.println("Cash returned:"+ (ds.getcash()-ds.gettotal()));
	}
}
