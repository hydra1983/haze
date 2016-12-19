package prayer;
import java.util.ArrayList;
import java.util.List;


public class Recycler {
	int Price;
	int Age;
	int Statement;
	int Mt;
	boolean StatementforMt=true;
	int AgeforU;
	int j=0;
	int Countrec=0;
	double Pri;
	Module r1;
	List<Module> recycle;
	List<Module> checkPass;
	List<Module> mend;
	
	Recycler(){
		recycle=new ArrayList<Module>();
		checkPass=new ArrayList<Module>();
		mend=new ArrayList<Module>();
	}
	public void clearRec(){
		recycle.clear();
	}
	
	public void clearMend(){
		mend.clear();
	}
	
	public void clearCP(){
		checkPass.clear();
	}
	/*public void recycle(int countrec){
		Countrec=countrec;
		for(int i=0;i<Countrec;i++){
			recycle.add(null);
		}
	}*/
	public void recycle(Module r){
		recycle.add(r);
	}
	
	public void Countrec(){
		Countrec=recycle.size();
	}
	public int GetCountrec(){
		return Countrec;
	}
	
	public void recycler2(){
		for(int i=0;i<recycle.size();i++){
			r1=recycle.get(i);
			r1.Statement=2;
		}
	}
	public void showRec(int aage){
		System.out.println(Countrec+"#"+aage);
		System.out.println(" ");
	}
	/*public void recycle1(Modules3 r){
		recycle.set(j,r);
		j=j+1;
		
	}*/
	/*public void recycler2(){
		for(int i=0;i<Countrec;i++){
			r1=recycle.get(i);
			r1.Statement=2;
		}
		
	}*/
	
	//end of recycler
	
	//check
	public void check(){
		for(int i=0;i<recycle.size();i++){
			r1=recycle.get(i);
			if(r1.Age<7){
				checkPass.add(r1);
				r1.StatementforMt=true;
			}
			else{
				r1.StatementforMt=false;
				r1.Statement=4;
			}
		}
	}//creat checkPassList
	
	public void showCk(){
		System.out.println(checkPass.size());
		System.out.println(r1.StatementforMt);
		System.out.println(mend.size());
	}
	
	public void forMend(){
		mend=checkPass;
	}
	
	public void mend(){
		for(int i=0;i<mend.size();i++){
			r1=mend.get(i);
			if(r1.Age<7){
				r1.AgeforU=r1.AgeforU-3;}
			
			r1.Statement=0;
			r1.StatementforU=true;
			if(r1.Type<6){
				Pri=(r1.Type-1)*5+10;}
			else{
				if(r1.Type<11){
					Pri=(r1.Type-6)*5+15;}
				else{
					if(r1.Type<16){
						Pri=(r1.Type-11)*5+10;}
					else{
						if(r1.Type<21){
							Pri=(r1.Type-16)*5+20;}
						else{
							Pri=(r1.Type-20)*5+20;}
					    }
					
			       }
				}
			
			r1.Price=(float) ((Pri/5)*4-r1.Mt*5);
			r1.Mt=r1.Mt+1;
		}
	}
	
	public void showMd(){
		System.out.println(mend.size());
		for(int i=0;i<mend.size();i++){
			r1=mend.get(i);
		System.out.println(r1.ID+"#"+r1.Age+"#"+r1.Statement+"#"+r1.Mt+"#"+r1.Price+"#"+r1.AgeforU);
		}
	}
	
	

}
