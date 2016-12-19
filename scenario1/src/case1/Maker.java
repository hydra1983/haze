package case1;
import java.util.ArrayList;
import java.util.List;

public class Maker {
	int ID;
	int Type;
	float Price;
	int Age;
	
	List<Module> production;
	Module mod;
	
	public Maker(){
		 production=new ArrayList<Module>();
		 mod=null;
	}
	public void produce(){
		for(int i=0;i<5;i++){
			production.add(new Module((i+11)*100000,i+1,i*5+10));
		}
		for(int i=0;i<5;i++){
			production.add(new Module((i+21)*100000,i+6,i*5+15));
		}
		for(int i=0;i<5;i++){
			production.add(new Module((i+31)*100000,i+11,i*5+10));
		}
		for(int i=0;i<5;i++){
			production.add(new Module((i+41)*100000,i+16,i*5+15));
		}
		for(int i=0;i<5;i++){
			production.add(new Module((i+51)*100000,(i+21),i*5+20));
		}		
	}
	public void produce1(int type){
		mod=production.get(type);
		mod.ID=mod.ID+1;
	}
	public Module produce2(){
		return new Module(mod.ID,mod.Type,mod.Price);
	}
	
	
	

}
