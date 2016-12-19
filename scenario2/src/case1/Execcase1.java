package case1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Execcase1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int www=0;
		int Mage=0;
		List<Module> list1=new ArrayList<Module>();
		List<Module> list2=new ArrayList<Module>();
		List<Module> list3=new ArrayList<Module>();
		List<Module> list4=new ArrayList<Module>();
		List<Module> list5=new ArrayList<Module>();
		List<Module> list=new ArrayList<Module>();
		List<User> users=new ArrayList<User>();
		//List<Module> check=new ArrayList<Module>();
		Maker mak3=new Maker();
		Module mol;
		User uu;
		
		for(int i=0;i<500;i++){
			users.add(new PUser());
		}
		
		for(int i=0;i<200;i++){
			users.add(new NUser());
		}
		
		for(int i=0;i<300;i++){
			users.add(new OUser());
		}
		
		for(int i=0;i<users.size();i++){
			uu=users.get(i);
			uu.SetUid(2000+i);
		}
		
		Collections.shuffle(users);
		
		mak3.produce();
		for(int i=0;i<2700;i++){
			for(int j=0;j<25;j++){
				mak3.produce1(j);
				if(j<5)
					list1.add(mak3.produce2());
				else
					if(j<10)
						list2.add(mak3.produce2());
					else
						if(j<15)
							list3.add(mak3.produce2());
						else
							if(j<20)
								list4.add(mak3.produce2());
							else
								list5.add(mak3.produce2());
			}
		}
		
		for(Mage=0;Mage<50;Mage++ ){
			
			for(int j=0;j<1000;j++){
				uu=users.get(j);
				uu.UseCur();
				
				uu.Setplan();
				uu.SetfSet();
				System.out.println(" ");
				System.out.println(uu.GetfSet(0)+"#"+uu.GetfSet(1)+"#"+uu.GetfSet(2)+"#"+uu.GetfSet(3)+"#");
				uu.Setmin(uu.GetfSet(0),uu.GetfSet(1),uu.GetfSet(2),uu.GetfSet(3));
				for(int i=0;i<4;i++){
					for(int g=0;g<5;g++){
						System.out.print(uu.plan[i][g]+"#");
					}
				}
				System.out.println(" ");
				System.out.println(uu.min[0]+"#"+uu.min[1]+"#"+uu.min[2]+"#"+uu.min[3]+"#"+uu.min[4]);
				System.out.println(" ");
				uu.SetobjT(uu.GetRak());
				System.out.println(uu.objT[0]+"#"+uu.objT[1]+"#"+uu.objT[2]+"#"+uu.objT[3]+"#"+uu.objT[4]);
				System.out.println(uu.GetRak());
				
				uu.curArray();
				uu.showcurA();
				uu.checkCur();//"show" is inserted
				//uu.SetP();
				uu.SetW();
				System.out.println(uu.P+"#"+uu.Wt+"#"+uu.Wp+"#"+uu.Wa+"#");
				
				for(int i=0;i<5;i++){
					www=uu.rep[i]+www;
				}
				
				for(int i=0;i<www;i++){
				    uu.SetDec();
					System.out.println(uu.Dec()+"*");
					switch(uu.Dec()){
					case 0:
						list=list1;
						break;
					case 1:
						list=list2;
						break;
				    case 2:
					    list=list3;
					    break;
				    case 3:
					    list=list4;
					    break;
				    default:
					    list=list5;
					    break;
					    }
					mol=list.get(1);
					
					for(int f=0;f<list.size();f++){
						mol=list.get(f);
						if(mol.Statement<1){
						uu.SearchVimax(mol);
						}
						
							}
					uu.ResetCur();
					uu.Sales();
					//uu.msPur();
					uu.clearVmax();// fang zhi ji ge list chong tu
					uu.clearPur();	
				}
				www=0;
				uu.clearDec();
				
				list=uu.cursys;
				//System.out.println("I'm here! ");
				System.out.println(list.size());
				for(int i=0;i<list.size();i++){
					mol=list.get(i);
					if(mol!=null){
					mol.show();}
				}
				uu.clearfSet();
				
			}
			
			
			
			
			
			System.out.println("############"+Mage+"#############");
				
				
			}
		
		
		try{
			PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("case2.txt")));
					
		for(int i=0;i<list1.size();i++){
			mol=list1.get(i);
			mol.show();
			pw.println(mol.ID+"#"+mol.Type+"#"+mol.Price+"#"+mol.Age+"#"+mol.Shin+"#"+mol.Statement+"#"+mol.Mt+"#"+mol.StatementforMt+"#"+mol.U_message+"#"+mol.StatementforU+"#"+mol.AgeforU+"#"+mol.Uid);
			
		}
		
		pw.println("********"+"list1 ended"+"********");
		
		for(int i=0;i<list2.size();i++){
			mol=list2.get(i);
			mol.show();
			pw.println(mol.ID+"#"+mol.Type+"#"+mol.Price+"#"+mol.Age+"#"+mol.Shin+"#"+mol.Statement+"#"+mol.Mt+"#"+mol.StatementforMt+"#"+mol.U_message+"#"+mol.StatementforU+"#"+mol.AgeforU+"#"+mol.Uid);
			
		}
		
		pw.println("********"+"list2 ended"+"********");
		
		for(int i=0;i<list3.size();i++){
			mol=list3.get(i);
			mol.show();
			pw.println(mol.ID+"#"+mol.Type+"#"+mol.Price+"#"+mol.Age+"#"+mol.Shin+"#"+mol.Statement+"#"+mol.Mt+"#"+mol.StatementforMt+"#"+mol.U_message+"#"+mol.StatementforU+"#"+mol.AgeforU+"#"+mol.Uid);
			
		}
		
		pw.println("********"+"list3 ended"+"********");
		
		for(int i=0;i<list4.size();i++){
			mol=list4.get(i);
			mol.show();
			pw.println(mol.ID+"#"+mol.Type+"#"+mol.Price+"#"+mol.Age+"#"+mol.Shin+"#"+mol.Statement+"#"+mol.Mt+"#"+mol.StatementforMt+"#"+mol.U_message+"#"+mol.StatementforU+"#"+mol.AgeforU+"#"+mol.Uid);
			
		}
		
		pw.println("********"+"list4 ended"+"********");
		
		for(int i=0;i<list5.size();i++){
			mol=list5.get(i);
			mol.show();
			pw.println(mol.ID+"#"+mol.Type+"#"+mol.Price+"#"+mol.Age+"#"+mol.Shin+"#"+mol.Statement+"#"+mol.Mt+"#"+mol.StatementforMt+"#"+mol.U_message+"#"+mol.StatementforU+"#"+mol.AgeforU+"#"+mol.Uid);
			
		}
		
		pw.println("********"+"list5 ended"+"********");
		
		
		pw.close();
		}catch(IOException e){
			System.err.println("error!");
		}
		
		
		/*
		for(int i=0;i<list1.size();i++){
			mol=list1.get(i);
			mol.show();
		}
		
		System.out.println("********"+"list1 ended"+"********");
		
		for(int i=0;i<list2.size();i++){
			mol=list2.get(i);
			mol.show();
		}
		
		System.out.println("********"+"list2 ended"+"********");
		
		for(int i=0;i<list3.size();i++){
			mol=list3.get(i);
			mol.show();
		}
		
		System.out.println("********"+"list3 ended"+"********");
		
		for(int i=0;i<list4.size();i++){
			mol=list4.get(i);
			mol.show();
		}
		
		System.out.println("********"+"list4 ended"+"********");
		
		for(int i=0;i<list5.size();i++){
			mol=list5.get(i);
			mol.show();
		}
		
		System.out.println("********"+"list5 ended"+"********");*/
			
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
