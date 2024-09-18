import java.util.Scanner;
class Swap{
	void swapping(){
		Scanner sc=new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter b value");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a="+a+"\nafter swapping b="+b);	
	}
}