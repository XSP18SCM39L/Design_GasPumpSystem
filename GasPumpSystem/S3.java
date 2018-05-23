//the S3 state class
//State Pattern
public class S3 extends State{
	private int id = 3;
	
	public S3(){
		
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
    	op.CancelMsg();
    	mda.ChangeState(0);
	}
    
    public void Approved(){
		
	}
    
    public void SelectGas(int g){//
    	op.SetPrice(g);
    	mda.ChangeState(4);
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
