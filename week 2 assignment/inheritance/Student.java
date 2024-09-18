import java.util.Scanner;
class Student{
	int id;
	String name;
	
	void read(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id and student name");
		id=sc.nextInt();
		name=sc.next();	
	}
	
	void display(){
		System.out.println("student id="+id);	
		System.out.println("Student name="+name);
	}
}