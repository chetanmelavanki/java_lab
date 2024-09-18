import java.util.Scanner;
class SumOfNatural{
	int i,sum=0;
	void add(int n){
		for(i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("The sum of 1 to "+n+" is:"+sum);
	}
}
class SumOfNaturalTester{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Provide range to calculate sum of natural numbers");
		n=sc.nextInt();
		SumOfNatural s=new SumOfNatural();
		s.add(n);
	}
}