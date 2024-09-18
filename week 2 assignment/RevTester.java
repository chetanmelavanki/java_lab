import java.util.Scanner;
class Reverse{
	int rev=0,rem=0;
	void revPali(int n){
		int temp=n;
		while(n!=0){
		rem=n%10;
		System.out.println("rem:"+rem);
		rev=(rev*10)+rem;
System.out.println("rev:"+rev);
		n=n/10;
System.out.println("n:"+n);
		}
		System.out.println("The reverse of enteres number is :"+rev);
		if(temp==rev)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a Palindrome number");
	}
}

class RevTester{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to revese");
		int rev;
		rev=s.nextInt();
		Reverse r = new Reverse();
		r.revPali(rev);
	}
}