import java.util.Scanner;

class Multiplicationtable
{
public static void main(String[] args){
	int mul,n,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Multiplication table number");
	n=s.nextInt();
	for(i=1;i<=10;i++){
		mul=n*i;
		System.out.println(n+" * "+i+" = "+mul);
		

	}
}
}