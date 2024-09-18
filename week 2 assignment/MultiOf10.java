import java.util.Scanner;
class MultiOf10{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int start,end;
	System.out.println("Enter starting number:");
	start=sc.nextInt();

	System.out.println("Enter starting number:");
	end=sc.nextInt();
	int i;
	for(i=start;i<=end;i++){
		if(i%10 == 0){
			System.out.println(i);
		}
	}
	}
}