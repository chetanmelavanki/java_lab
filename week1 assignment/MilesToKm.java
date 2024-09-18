import java.util.Scanner;
class MilesToKm{
	float mile=1.609344f;// 1mile=1.09344
	float km,result;
	public void milesToKm(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the miles");
		km=sc.nextFloat();
		result = mile*km;
		System.out.println(result);
	}
}