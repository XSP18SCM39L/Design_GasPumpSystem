//Data for the gas pump 1
public class DS_1 extends DS {
	private float a;
	private float b;
	private float a_temp;
	private float b_temp;
	private float price;
	private int num;
	private float total;
	
	public void seta(float a){
		this.a = a;
	}
	
	public void setb(float b){
		this.b = b;
	}
	
	public void setat(float at){
		this.a_temp = at;
	}
	
	public void setbt(float bt){
		this.b_temp = bt;
	}
	
	public float geta(){
		return a;
	}
	
	public float getb(){
		return b;
	}
	
	public float getat(){
		return a_temp;
	}
	
	public float getbt(){
		return b_temp;
	}
	
	public void setprice(float price){
		this.price = price;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setnum(int num){
		this.num = num;
	}
	
	public int getnum(){
		return num;
	}
	
	public void settotal(float total){
		this.total = total;
	}
	
	public float gettotal(){
		return total;
	}
}
