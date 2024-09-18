import java.util.Scanner;
class EvenOrOdd{
	void check(){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n value to check even or odd");
		n=sc.nextInt();
		if(n%2 == 0){
			System.out.println(n+" is even number");
		}
		else{
			System.out.println(n+" is odd number");
		}
	}
}