package case1;

import java.util.Random;

public class NUser extends User{
	int [] fSet=new int[4];
	Random rnd=new Random();
	int Rak;
	int rad1;
	int rad2;
	
	public NUser(){}

	public void Setplan(){
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

		Rak=rnd.nextInt(3);
		
	}
	
	public void SetfSet(){
		rad1=rnd.nextInt(4);
		rad2=rnd.nextInt(4);
		
		fSet[rad1]=1;
		fSet[rad2]=1;
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
	
	public int GetRak(){
		return Rak;
	}
	

}
