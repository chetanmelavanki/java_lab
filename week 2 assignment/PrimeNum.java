import java.util.Scanner;
class Prime{
	int check(int num){
		int i,count=0;
		for(i=1;i<=num;i++){
			if(num % i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(num+ " is prime number");
		}
		else{
			System.out.println(num+ " is not a prime number");
		}
		return count;
	}
}

class PrimeNum{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		Prime p=new Prime();
		System.out.println("Enter number to check prime number or not");
		int num;
		num=s.nextInt();
		p.check(num);
	}
}