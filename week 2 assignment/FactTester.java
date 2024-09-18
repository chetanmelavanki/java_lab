class Factorial{
	int f=1,n=5;
	void fact(){
	for(int i=1;i<=n;i++){
		f=f*i;
	}
	System.out.println("Factorial of "+n+" = "+f); 
	}
	
}

class FactTester{
	public static void main(String args[]){
	Factorial f=new Factorial();
	f.fact();	
	}
}