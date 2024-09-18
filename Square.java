import java.util.Scanner;
class Square{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number");
	int num1=in.nextInt();
	int c=num1*num1;
	System.out.println("The cube of "+num1+" is "+c);	
}
}