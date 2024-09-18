import java.util.Scanner;
class Area{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of radius");
	int radius = scan.nextInt();
	double pi = 3.142,area;
	area = pi * radius * radius;
	System.out.println("Area = "+area); 
}
}