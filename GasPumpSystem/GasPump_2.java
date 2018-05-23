//Class for the gas pump system 2
public class GasPump_2 {
	public MDA_EFSM mda;
	public S0 s0;
	public S1 s1;
	public S2 s2;
	public S3 s3;
	public S4 s4;
	public S5 s5;
	public S6 s6;
	public S7 s7;
	public CF_2 cf2;
	public Op op;
	public DS_2 ds;
	
	// in constructor, create all the class needed for the gas pump
	public GasPump_2(){
		this.op = new Op();
		this.cf2 = new CF_2();
		this.mda = new MDA_EFSM();
		this.s0 = new S0();
		this.s1 = new S1();
		this.s2 = new S2();
		this.s3 = new S3();
		this.s4 = new S4();
		this.s5 = new S5();
		this.s6 = new S6();
		this.s7 = new S7();
		mda.initialize(s0, s1, s2, s3, s4, s5, s6, s7);
		s0.initialize(mda, op);
		s1.initialize(mda, op);
		s2.initialize(mda, op);
		s3.initialize(mda, op);
		s4.initialize(mda, op);
		s5.initialize(mda, op);
		s6.initialize(mda, op);
		s7.initialize(mda, op);
		op.initialize(cf2.sd, cf2.pm, cf2.sc, cf2.dpm, cf2.pgu, cf2.sp, cf2.st, cf2.ds);
		ds = cf2.ds;	
		
	}
	
	
	//all operations of the gas pump 2
	public void Activate(int a, int b, int c){
		if (a > 0 && b > 0 && c > 0) {
			ds.setaa_temp(a);
			ds.setbb_temp(b);
			ds.setcc_temp(c);
			mda.Activate();
		}
	}
	
	public void Start(){
		mda.Start();
	}
	
    public void PayCash(int c){
    	if(c > 0){
    		ds.setcash_temp(c);
    		mda.PayType(2);
    	}	
	}
    
    
    public void Cancel(){
		mda.Cancel();
	}
    
    
    public void Super(){
		mda.SelectGas(2);
	}
    
    public void Regular(){
    	mda.SelectGas(1);
    }
    
     public void Premium(){
    	mda.SelectGas(3);
    }
    
    public void StartPump(){
    	mda.StartPump();
    }
    
    public void PumpLiter(){
    	mda.Pump();
    }
    
    public void Stop(){
    	mda.StopPump();
    }
    
     public void Receipt(){
     	mda.Receipt();
    }
     
     public void NoReceipt(){
     	mda.NoReceipt();
     }

}
