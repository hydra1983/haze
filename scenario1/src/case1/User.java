package case1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class User {
	
	Random rnd=new Random();
	int Utype;
	
	int []A= new int[5];
	int []B= new int[5];
	int []C= new int[5];
	int []D= new int[5];
	int []rep=new int[5];
	boolean ch;
	
	int uid;
	int Usertype;
	int Skill;
	int Infor;
	int Plan;
	float P;
	double Found;
	float Prod;
	float Vt;
	float Vp;
	float Va;
	float Vi;
	int Pt;
	int Pp;
	int Pa;
	float Wt;
	float Wp;
	float Wa;
	float Vmax;
	int Dec;
	int rad;
	int x=0;
	int Rak;
	Module Umol;
	Module Pur;
	
	List<Module> cursys;
	
	int [] cur=new int[5];
	int [] min=new int[5];
	int [] objT=new int[5];
	int [][] plan=new int[4][5];
	int [] fSet=new int[4];
	
	
	
	public User(){
		A[0]=2;
		A[1]=1;
		
		B[0]=1;
		B[1]=1;
		B[2]=2;
		B[4]=1;
		
		C[0]=2;
		C[2]=3;
		C[3]=5;
		
		D[0]=2;
		D[1]=3;
		D[2]=5;
		D[3]=4;
		D[4]=3;
		
		plan[0][0]=2;
		plan[0][1]=1;
		plan[1][0]=1;
		plan[1][1]=1;
		plan[1][2]=2;
		plan[1][4]=1;
		plan[2][0]=2;
		plan[2][2]=3;
		plan[2][3]=5;
		plan[3][0]=2;
		plan[3][1]=3;
		plan[3][2]=5;
		plan[3][3]=4;
		plan[3][4]=3;
		
		
		for(int i=0;i<5;i++){
			cur[i]=-1;
		}
		
		for(int i=0;i<5;i++){
			objT[i]=-1;
		}
		
		cursys=new ArrayList<Module>();
		cursys.add(new Module(0,0,0));
		cursys.add(new Module(0,0,0));
		cursys.add(new Module(0,0,0));
		cursys.add(new Module(0,0,0));
		cursys.add(new Module(0,0,0));
		/*for(int i=0;i<5;i++){
		cursys.add(null);
		}*/
	}
	
	public void SetUid(int id){
		this.uid=id;
	}
	
	public void SetP(){
		this.Pt=rnd.nextInt(10)+1;
		this.Pp=rnd.nextInt(2)+1;
		this.Pa=rnd.nextInt(2)+1;
	}
	
	public void SetW(){
		this.Wt=(float) 0.5;
		this.Wp=(float) 0.5;
		this.Wa=(float) 0;
	}
	
	/*
	public void Com(int a){
		switch(a){
		case 0:
			for(int i=0;i<5;i++){
			min[i]=A[i];
			}
			break;
		case 1:
			for(int i=0;i<5;i++){
			min[i]=B[i];
			}
			break;
		case 2:
			for(int i=0;i<5;i++){
			min[i]=C[i];
			}
			break;
		case 3:
			for(int i=0;i<5;i++){
			min[i]=D[i];
			}
			break;
		}
	}//for SetobjT
	
	
	public void showCom(){
		for(int i=0;i<5;i++){
			System.out.println(min[i]);
		}
	}
	
	*/
	
	public void Setplan(){}
	
	public void SetfSet(){
		fSet[0]=0;
		fSet[1]=0;
		fSet[2]=0;
		fSet[3]=0;
	}
	
	public int GetfSet(int i){
		return fSet[i];
	}
	
	public void clearfSet(){
		fSet[0]=0;
		fSet[1]=0;
		fSet[2]=0;
		fSet[3]=0;
	}
	
	
	public void Setmin(int a,int b,int c,int d){
		/*for(int i=5;i<0;i++){
			plan[0][i]=A[i];
			plan[1][i]=B[i];
			plan[2][i]=C[i];
			plan[3][i]=D[i];
		}*/
		
		if(a==0){
			for(int i=0;i<5;i++){
				plan[0][i]=0;
			}		
		}
		
		if(b==0){
			for(int i=0;i<5;i++){
				plan[1][i]=0;
			}
		}
		
		if(c==0){
			for(int i=0;i<5;i++){
				plan[2][i]=0;
			}
		}
		
		if(d==0){
			for(int i=0;i<5;i++){
				plan[3][i]=0;
			}
		}
		
		for(int i=0;i<5;i++){
			min[i]=plan[0][i];
			for(int j=0;j<3;j++){
				if(min[i]<plan[j+1][i]){
					min[i]=plan[j+1][i];
				}
			}
		}
		
	}
	
	public int GetRak(){
		return 0;
	}
	
	public void SetobjT(int a){
		//Com(a);
		/*for(int i=0;i<5;i++){
			objT[i]=min[i];
		}*/
		for(int i=0;i<5;i++){
			objT[i]=min[i]+a;
			if(objT[i]>5){
				int j2=objT[i]-5;
				for(int j=0;j<j2;j++){
					objT[i]=objT[i]-1;
				}//make sure objT[i]<=5;
		}
		
		}
		
	}
	
	//t=1~5
	public float SetVt(int t,int lev){
		//t=t-1;
		if(objT[t]==min[t]){
			if(lev<min[t]){
				return 0;}
			else{
				return 5;}
		}
		else{
			if(lev<min[t]){
				return 0;}
			else{
				if(lev==min[t]){
					return 5;}
				else{
					if(lev>=objT[t]){
						return 5;}
					else{
						return 5;}
				}
			}
		}
	}
	
	public int SetVp(float pr){
		if(pr<20){
			return 5;}
		else{
			if(pr<30){
				return 4;}
			else{
				if(pr<40){
					return 3;}
				else{
					if(pr<50){
						return 2;}
					else{
						return 1;}
				}
			}
			
		}
	}
	
	public int SetVa(int agfu){
		if(agfu>7){
			return 0;}
		else{
			if(agfu<2){
				return 0;}
			else{
				return 0;}
		}
	}
	
	public float SetVi(float vt,float vp,float va){
		return vt*Wt+vp*Wp+va*Wa;
	}
	
	public void collect(Module co){
		cursys.add(co);
	}
	
	public int exchT(int Tt){
		if(Tt==1||Tt==6||Tt==11||Tt==16||Tt==21){
			return 1;}
		else{
			if(Tt==2||Tt==7||Tt==12||Tt==17||Tt==22){
				return 2;}
			else{
				if(Tt==3||Tt==8||Tt==13||Tt==18||Tt==23){
					return 3;}
				else{
					if(Tt==4||Tt==9||Tt==14||Tt==19||Tt==24){
						return 4;}
					else{
						return 5;}
				}
			}
		}
	}
	
	public void Sort(){
		Collections.sort(cursys, new Comparator<Module>(){
		      public int compare(Module t1, Module t2) {
		        return t1.Type - t2.Type;
		      }
		    });
	}
	
	public void showSort(){
		System.out.println(cursys.size());
		for(int i=0;i<cursys.size();i++){
			Umol=cursys.get(i);
		System.out.println(Umol.ID+"#"+Umol.Type+"#"+Umol.Price+"#"+Umol.Age+"#"+Umol.Shin+"#"+Umol.Statement+"#"+Umol.Mt+"#"+Umol.StatementforMt+"#"+Umol.U_message+"#"+Umol.StatementforU+"#"+Umol.AgeforU+"#"+Umol.ShinforU);
	
		}
	}
	
	public void curArray(){
		/*for(int i=0;i<cursys.size();i++){
			Umol=cursys.get(i);
			if(Umol.Type<6)
				cur[0]=Umol.Type;
				else
					if(Umol.Type<11)
						cur[1]=Umol.Type;
					else
						if(Umol.Type<16)
							cur[2]=Umol.Type;
						else
							if(Umol.Type<21)
								cur[3]=Umol.Type;
							else
								cur[4]=Umol.Type;
		}*///no need!
		for(int i=0;i<5;i++){
			Umol=cursys.get(i);
			if(Umol!=null){
			cur[i]=Umol.Type;}
		}
		for(int i=0;i<5;i++){
			if(cur[i]==0){
				cur[i]=0;}
			else{
				cur[i]=cur[i]-i*5;}
		}
		for(int i=0;i<5;i++){
			Umol=cursys.get(i);
			if(Umol!=null){
				if(Umol.StatementforU==false){
					cur[i]=0;}
			}
			else{
				cur[i]=0;}
			
		}
	}
	
	public void showcurA(){
		for(int i=0;i<5;i++){
			System.out.println(cur[i]);
		}
	}
	
	public void checkCur(){
		for(int i=0;i<5;i++){
			if(cur[i]<min[i]||(objT[i]-cur[i])>2){
				rep[i]=1;
				ch=true;
			}// if >min?
			else{
				rep[i]=0;
				ch=false;
			}
			
			
			 System.out.print(rep[i]+"#");
		}
		System.out.println(ch);
		
	}

	
	public void SetDec(){
		for(int i=0;i<5;i++){
			if(rep[i]==1){
				Dec=i;
			rep[i]=0;
			break;
			}
		}
	}
	
	public int Dec(){
		return Dec;
	}
	
	public void clearDec(){
		Dec=0;
	}
	
	public void clearVmax(){
		Vmax=0;
	}
	
	public void clearPur(){
		Pur=null;
	}
	
	public void SearchVimax(Module pur){
		Vt=SetVt(Dec(),exchT(pur.Type));
		Vp=SetVp(pur.Price);
		Va=SetVa(pur.AgeforU);
		Vi=SetVi(Vt,Vp,Va);
		if(Vmax<Vi){
			Vmax=Vi;
			Pur=pur;
		}
	}
	
	/*
	public void CheckSales(){
		return cursys.get(Dec);
	}
	*/
	
	public void ResetCur(){
		//cursys.set(Dec, Pur);
		Umol=cursys.get(Dec());
		if(Umol!=null&&Umol.StatementforU==false){
			Umol.Statement=4;
			Umol.Uid=0;
			Umol.U_message=Umol.U_message+"/"+uid;
		}
		else{
			if(Umol!=null){
				Umol.Statement=4;
			    Umol.Uid=0;
			    Umol.U_message=Umol.U_message+"/"+uid;}
		}
		if(Umol!=null){
		Found=Found+Umol.Price;}
		//add sale statement!!!
		//cursys.add(Pur);
		cursys.set(Dec(),Pur);
		Umol=cursys.get(Dec());
		//System.out.println(Umol+"!!!!!!!!!!!!!!!!!!!!!!!");
		if(Umol!=null){
		Umol.Statement=1;
		Umol.Uid=uid;}
	}//sale and reset cursystem
	
	public void Sales(){
		for(int i=0;i<cursys.size();i++){
			Umol=cursys.get(i);
			if(Umol!=null){
				if(min[i]==0&&objT[i]==0){
					Umol.Statement=4;
					Umol.U_message=Umol.U_message+"/"+uid;
				}
			}
		}
	}
		
	
	public void UseCur(){
		for(int i=0;i<cursys.size();i++){
			Umol=cursys.get(i);
			if(Umol!=null){
			
			if(Umol.Statement==1){
				Umol.Age=Umol.Age+1;
			    Umol.AgeforU=Umol.AgeforU+1;
			    Umol.Price=(float) (0.9*Umol.Price);
			    rad=rnd.nextInt(20); 
			    if(Umol.AgeforU>(7+3*Umol.Mt)){x=6;}
			    else{x=2;}
			
				if(rad<x){
					Umol.StatementforU=false;
				}
			  
				
			}
			Umol.Shin=false;
			}
			
			
			
			
		}
	}
	

}