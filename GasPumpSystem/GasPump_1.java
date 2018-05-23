// Class for the gas pump system 1
public class GasPump_1 {
	public MDA_EFSM mda;
	public S0 s0;
	public S1 s1;
	public S2 s2;
	public S3 s3;
	public S4 s4;
	public S5 s5;
	public S6 s6;
	public S7 s7;
	public CF_1 cf1;
	public Op op;
	public DS_1 ds;
	
	// in constructor, create all the class needed for the gas pump
	public GasPump_1(){
		this.op = new Op();
		this.cf1 = new CF_1();
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
		op.initialize(cf1.sd, cf1.pm, cf1.sc, cf1.dpm, cf1.pgu, cf1.sp, cf1.st, cf1.ds);
		ds = cf1.ds;	
	}

	
	
	//All operations of the gas pump 1
	public void Activate(float a, float b){
		if (a > 0 && b > 0) {
			ds.setat(a);
			ds.setbt(b);
			mda.Activate();
		}
	}
	
	public void Start(){
		mda.Start();
	}
	
    public void PayCredit(){
		mda.PayType(1);
	}
    
    public void Reject(){
		mda.Reject();
	}
    
    public void Cancel(){
		mda.Cancel();
	}
    
    public void Approved(){
		mda.Approved();
	}
    
    public void Super(){
		mda.SelectGas(2);
	}
    
    public void Regular(){
    	mda.SelectGas(1);
    }
    
    public void StartPump(){
    	mda.StartPump();
    }
    
    public void PumpGallon(){
    	mda.Pump();
    }
    
    public void StopPump(){
    	mda.StopPump();
    }
	
}
