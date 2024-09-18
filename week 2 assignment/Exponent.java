import java.util.Scanner;
class Exponent{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	int base,power;
	
	System.out.println("Enter a base");
	base = sc.nextInt();

	System.out.println("Enter a power");
	power = sc.nextInt();

	int result=1;

	for(int i=0;i<power;i++){
		result =result*base;
	}

	System.out.println("The exponent of "+base+"^"+power+" is: "+result);
	}
}