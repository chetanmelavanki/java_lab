import java.util.Scanner;
class LCM{
	int hcf(int a,int b){
		int hcf=0;
		for(int i=1;i<=a || i<=b;i++){
			if(a%i==0 && b%i==0){
				hcf=i;
			}
		
		}
		//System.out.println("Hcf of given two number is:"+hcf);
		return hcf;
	}

	int lcm(int a,int b){
		int hcf=hcf(a,b);
		int lcm=(a*b)/hcf;
		System.out.println("The LCM ofgiven two number is:"+lcm);
		return lcm;
	}
}
class LCMTester{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		LCM l=new LCM();
		l.lcm(a,b);
	}
}