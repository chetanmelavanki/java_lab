import java.util.Scanner;
class AreaAndPerimeter{
int radius;
double pi = 3.142,area,c;
void calculateAreaOfCircle(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of radius of circle");
	radius = scan.nextInt();
	area = pi * radius * radius;
	System.out.println("Area = "+area); 
}
void calculatePerimeterOfCircle(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of radius of perimeter");
	radius = scan.nextInt();
	c=2*pi*radius;
	System.out.println("Perimeter of circle = "+c); 	
}
}