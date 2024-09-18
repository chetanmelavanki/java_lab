import java.util.Scanner;
class Gradee{
		void check(){
		Scanner s=new Scanner(System.in);
		int per;	
		System.out.println("ENter the percentage");
		per=s.nextInt();
		if(per>=90 && per<=100){
			System.out.println("Grade A");
		}
		else if(per>=80 && per<90){
			System.out.println("Grade B");
		}
		else if(per>=70 && per<80){
			System.out.println("Grade C");
		}
		else if(per>=60 && per<70){
			System.out.println("Grade d");
		}	
		else if(per>=50 && per<60){
			System.out.println("Grade E");
		}
		else if(per>=40 && per<50){
			System.out.println("Grade E");
		}
		else if(per<40){
			System.out.println("Grade F");
		}
		else{
			System.out.println("Enter correct percentage");
		}
	}
}
class Grade{
	public static void main(String args[]){
	Gradee g=new Gradee();
	g.check();	
	}
		
}