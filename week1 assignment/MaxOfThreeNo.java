import java.util.Scanner;
class MaxOfThreeNo{
	int a,b,c;
	MaxOfThreeNo(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of A,B and C");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b && a>c){
		System.out.println(a);
	}
	else if(b>a && b>c){
		System.out.println(b);
	}
	else{
		System.out.println(c);
	}
}
}