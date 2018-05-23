//the S5 state class
//State Pattern
public class S5 extends State{
	private int id = 5;
	
	public S5(){
		
	}

	public int id(){
		return id;
	}
	
	public void Activate(){
		
	}
	
	public void Start(){
		
	}
	
    public void PayType(int t){//credit t=1, cash t=2
		
	}
    
    public void Reject(){
		
	}
    
    public void Cancel(){
		
	}
    
    public void Approved(){
		
	}
    
    public void SelectGas(int g){//
		
	}
    
    public void StartPump(){
    	
    }
    
    public void Pump(){
    	
    	op.PumpGasUnit();
    	op.GasPumpedMsg();
    }
    
    public void StopPump(){
    	op.StopMsg();
    	mda.ChangeState(6);
    }
    
    public void Receipt(){
    	
    }
    
    public void NoReceipt(){
    	
    }
}
