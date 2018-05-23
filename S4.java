//the S4 state class
//State Pattern
public class S4 extends State{
	private int id = 4;
	
	public S4(){
		
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
    	op.SetInitial();
    	op.ReadyMsg();
    	mda.ChangeState(5);
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
