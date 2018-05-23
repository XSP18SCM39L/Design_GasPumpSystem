//the S0 state class
//State Pattern
public class S0 extends State {

	private int id = 0;
    
	public S0(){
	}
	
	public int id(){
		return id;
	}
	
	public void Activate(){
		
	}
	
	public void Start(){
    	//System.out.println(mda.s.id());
		op.PayMsg();
		mda.ChangeState(1);
    	//System.out.println(mda.s.id());
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
    	
    }
    
    public void StopPump(){
    	
    }
    
    public void Receipt(){
    	
    }
    
    public void NoReceipt(){
    	
    }
}
