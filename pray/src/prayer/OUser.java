package prayer;

public class OUser extends User{
	int [] fSet=new int[4];
	int Rak;
public OUser(){}
	
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

		Rak=0;
		
	}
	
	public void SetfSet(){
		fSet[0]=1;
		fSet[1]=1;
		fSet[2]=1;
		fSet[3]=1;
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
