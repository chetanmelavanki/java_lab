import java.util.Scanner;
class Average{
public static void main(String args[]){
	int avg,sum=0,n,sub,count=1;
	Scanner scan = new Scanner(System.in);
	System.out.println("How many number to calculate average");
	n = scan.nextInt();
	System.out.println("Enter " + n + " Numbers:");
	while(count <= n){
		
		sub=scan.nextInt();
		sum = sum+sub;
		++count;
	}
	avg = sum/n;
	System.out.println("Average of " + n +" Numbers is : "+ avg);
}
}