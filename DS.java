//Abstract class for the data store
public abstract class DS {
	//gaspump 1
	private float a;
	private float b;
	private float a_temp;
	private float b_temp;
	private float price;
	private int num;
	private float total;
	
	//gaspump 2
	private int aa;
	private int bb;
	private int cc;
	private int aa_temp;
	private int bb_temp;
	private int cc_temp;
	private int cash;
	private int cash_temp;
	
	public DS(){
		
	}

	//gaspump 1
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
	
	
	
	//gas pump 2
	public void setaa(int a){
		this.aa = a;
	}
	
	public void setbb(int b){
		this.bb = b;
	}
	
	public void setcc(int c){
		this.cc = c;
	}
	
	public void setaa_temp(int a){
		this.aa_temp = a;
	}
	
	public void setbb_temp(int b){
		this.bb_temp = b;
	}
	
	public void setcc_temp(int c){
		this.cc_temp = c;
	}
	
	public int getaa(){
		return aa;
	}
	
	public int getbb(){
		return bb;
	}
	
	public int getcc(){
		return cc;
	}
	
	public int getaa_temp(){
		return aa_temp;
	}
	
	public int getbb_temp(){
		return bb_temp;
	}
	
	public int getcc_temp(){
		return cc_temp;
	}
	
	public void setcash(int c){
		this.cash = c;
	}
	
	public void setcash_temp(int c){
		this.cash_temp = c;
	}
	
	public int getcash(){
		return cash;
	}
	
	public int getcash_temp(){
		return cash_temp;
	}
	
	//total
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
