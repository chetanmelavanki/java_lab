import java.util.Scanner;
class HCF{
	int hcf(int a,int b){
		int hcf=0;
		for(int i=1;i<=a || i<=b;i++){
			if(a%i==0 && b%i==0){
				hcf=i;
			}
		
		}
		System.out.println("Hcf of given two number is:"+hcf);
		return hcf;
	}


}
class HCFTester{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		HCF h=new HCF();
		h.hcf(a,b);

	}
}