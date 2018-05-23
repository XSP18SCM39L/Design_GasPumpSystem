//the S2 state class
//State Pattern
public class S2 extends State{
	private int id = 2;
	
	public S2(){
		
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
    	op.RejectMsg();
    	mda.ChangeState(0);
	}
    
    public void Cancel(){
		
	}
    
    public void Approved(){
    	op.DisplayMenu();
    	mda.ChangeState(3);
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
