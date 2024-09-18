class Fibonacci{

	void fib(int n){
		int n1=0,n2=1,i;
		for(i=2;i<=n;i++){
			System.out.println(n1+" ");
			int n3=n2+n1;
			n1=n2;
			n2=n3;
		}
	}
}
class FibTester{
	public static void main(String args[]){
		Fibonacci f=new Fibonacci();
		f.fib(10);
	}	
}