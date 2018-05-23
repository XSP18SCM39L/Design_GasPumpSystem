//Abstract class for state class
//State Pattern
public abstract class State {
    private int id;
    MDA_EFSM mda;
    Op op;
    
    public State(){

    }
    
    public void initialize(MDA_EFSM mda, Op op){
    	this.mda = mda;
    	this.op = op;
    }
		
    public int id(){
    	return id;
    }
    
    abstract void Activate();
	
	abstract void Start();
	
	abstract void PayType(int t);//credit t=1, cash t=2
    
	abstract void Reject();
    
	abstract void Cancel();
    
	abstract void Approved();
    
	abstract void SelectGas(int g);
    
	abstract void StartPump();
    
	abstract void Pump();
    
	abstract void StopPump();
    
	abstract void Receipt();
    
	abstract void NoReceipt();

}
