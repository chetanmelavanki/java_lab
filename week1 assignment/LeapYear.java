import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		Leap l=new Leap();
		l.checkLeapYear();	
	}
}

class Leap{
	void checkLeapYear(){
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		year=sc.nextInt();
		if(year%400==0 && year%4==0 && year%100==0){
			System.out.println("year is leap year");
		}	
		else
			System.out.println("year is not a leap year");
	}	
}