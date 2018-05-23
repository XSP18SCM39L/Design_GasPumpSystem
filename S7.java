//the start state class
//State Pattern
public class S7 extends State{
    private int id = 7;
	
	public S7(){
		
	}
	
	public int id(){
		return id;
	}

    public void Activate(){
    	op.StoreData();
    	mda.ChangeState(0);

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
    	
    }
    
    public void NoReceipt(){
    	
    }
}
