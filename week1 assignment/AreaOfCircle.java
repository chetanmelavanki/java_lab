import java.util.Scanner;
class AreaOfCircle{
int radius;
double pi = 3.142,area;
void calculateAreaOfCircle(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of radius");
	radius = scan.nextInt();
	area = pi * radius * radius;
	System.out.println("Area = "+area); 
}
}