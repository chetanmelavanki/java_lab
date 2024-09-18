import java.util.Scanner;
class CountNum{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num,count=0;
	System.out.println("Enter a number to count digits");
	num = sc.nextInt();
	while(num!=0){
		num=num/10;
		count++;
	}
	System.out.println("The count of enter number is : "+count);
	}
}