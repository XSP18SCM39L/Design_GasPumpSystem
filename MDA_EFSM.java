//MDA_EFSM class for the model
//State Pattern
public class MDA_EFSM {
	State[] ls;
	State s;
	
	public MDA_EFSM(){
	}
	
	public void initialize(S0 s0, S1 s1, S2 s2, S3 s3, S4 s4, S5 s5, S6 s6, S7 s7){
		ls = new State[8];
		ls[0] = s0;
		ls[1] = s1;
		ls[2] = s2;
		ls[3] = s3;
		ls[4] = s4;
		ls[5] = s5;
		ls[6] = s6;
		ls[7] = s7;
		s = ls[7];
	}
	
	
	//De-centralized state pattern change state operation
	public void ChangeState(int d){
		s = ls[d];
	}
	
	
	//All meta events for MDA_EFSM model
	public void Activate(){
		if(s.id() == 7){
			s.Activate();
		}
	}
	
	public void Start(){
		if(s.id() == 0){
			s.Start();
		}
	}
	
    public void PayType(int t){//credit t=1, cash t=2
    	if(s.id() == 1){
			s.PayType(t);
		}
	}
    
    public void Reject(){
    	if(s.id() == 2){
			s.Reject();
		}
	}
    
    public void Cancel(){
    	if(s.id() == 3){
			s.Cancel();
		}
	}
    
    public void Approved(){
    	if(s.id() == 2){
			s.Approved();
		}
	}
    
    public void SelectGas(int g){//regular 1, super 2, premium 3
    	if(s.id() == 3){
			s.SelectGas(g);
		}
	}
    
    public void StartPump(){
    	if(s.id() == 4){
			s.StartPump();
		}
    }
    
    public void Pump(){
    	if(s.id() == 5){
			s.Pump();
		}
    }
    
    public void StopPump(){
    	if(s.id() == 5){
			s.StopPump();
		}
    }
    
    public void Receipt(){
    	if(s.id() == 6){
			s.Receipt();
		}
    	
    }
    
    public void NoReceipt(){
    	if(s.id() == 6){
			s.NoReceipt();
		}
    }

}
