import java.util.Scanner;
class Prime1{
	void check(int num1,int num2){
		int i,j,count=0;
		for(i=num1;i<=num2;i++){
			for(j=1;j<=i;j++){
				if(i % j==0){
					count++;
				}
			}
		if(count==2){
			System.out.println(i);
		}
		
		}
		
		
	}
}

class PrimeNumBetween{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		Prime1 p=new Prime1();
		int num1,num2;
		
		System.out.println("Enter a 1st number");
		num1=s.nextInt();
		
		System.out.println("Enter a 2nd number");
		num2=s.nextInt();		
		
		p.check(num1,num2);
	}
}