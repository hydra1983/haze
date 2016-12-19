package prayer;


public class Module{
	int ID;
	int Type;
	float Price;
	int Age;
	boolean Shin;
	int Statement;
	int Mt;
	boolean StatementforMt;
	int Uid;//user's name and AgeforU
	boolean StatementforU;
	int AgeforU;
	boolean ShinforU;
	String U_message;
	
	public Module(){}
	
	public Module(int id,int type,float price){
		ID=id;
		Type=type;
		Price=price;
		Age=0;
		Shin=true;
		Statement=0;
		Mt=0;
		StatementforMt=true;
		Uid=0;
		StatementforU=true;
		AgeforU=0;
		ShinforU=true;
		U_message="*";
	}
	public void show(){
		System.out.println(ID+"#"+Type+"#"+Price+"#"+Age+"#"+Shin+"#"+Statement+"#"+Mt+"#"+StatementforMt+"#"+U_message+"#"+StatementforU+"#"+AgeforU+"#"+Uid);
	}

}

