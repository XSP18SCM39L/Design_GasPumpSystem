//the S1 state class
//State Pattern
public class S1 extends State{
	private int id = 1;
	
	public S1(){
		
	}
	
	public int id(){
		return id;
	}
	
   public void Activate(){
		
	}
	
	public void Start(){
		
	}
	
    public void PayType(int t){//credit t=1, cash t=2
    	if(t == 1){
    		mda.ChangeState(2);
    		System.out.println("----CREDIT RECIEVED AND GOTO APPROVE----");
    	}
    	if(t == 2){
    		op.StoreCash();
    		op.DisplayMenu();
    		mda.ChangeState(3);
    	}
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
