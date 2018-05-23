//the S6 state class
//State Pattern
public class S6 extends State{
	private int id = 6;

	public S6(){
		
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
    	
    }
    
    public void StopPump(){
    	
    }
    
    public void Receipt(){
    	op.PrintReceipt();
    	op.ReturnCash();
    	mda.ChangeState(0);
    }
    
    public void NoReceipt(){
    	op.ReturnCash();
    	mda.ChangeState(0);
    }
}
