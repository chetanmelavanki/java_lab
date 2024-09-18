import java.util.Scanner;
public class Prime_To_{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Enter a 1st number");
		num1=s.nextInt();
		
		System.out.println("Enter a 2nd number");
		num2=s.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}