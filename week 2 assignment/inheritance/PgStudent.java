import java.util.Scanner;
class PgStudent extends Student{
	int m1,m2,m3,result;
	
	void read(){
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m1, m2 and m3 marks of PgStudent");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void display(){
		super.display();
		result=(m1+m2+m3)/3;
		System.out.println("result="+result);
	}

	public static void main(String args[]){
		PgStudent pg=new PgStudent();
		pg.read();
		pg.display();		
	}
}