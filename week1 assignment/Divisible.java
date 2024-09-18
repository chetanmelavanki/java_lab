import java.util.Scanner;
class Divisible{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year");
		int n;
		n=s.nextInt();
		if(n%5==0)
			System.out.println("divisible by 5");
		else
			System.out.println("not divisible by 5");
	}
}