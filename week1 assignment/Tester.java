class Tester{
public static void main(String args[]){
	//tesing 1st assignment i,e Printing My Name
	MyName name = new MyName();
	name.MyName();

	System.out.println("-----------------------------------------------------------");

	//Testing 2nd Assignment i,e addition of two numbers
	Addition add=new Addition();
	int res=add.add(10,2);
	System.out.println(res);


	System.out.println("-----------------------------------------------------------");

	//Area of Circle
	AreaOfCircle area=new AreaOfCircle();
	area.calculateAreaOfCircle();


	System.out.println("-----------------------------------------------------------");
	//Area of Circle
	AreaAndPerimeter area1 = new AreaAndPerimeter();
	area1.calculateAreaOfCircle();
	area1.calculatePerimeterOfCircle();

	System.out.println("-----------------------------------------------------------");
	//Even or Odd
	EvenOrOdd even =  new EvenOrOdd();
	even.check();
	
	System.out.println("-----------------------------------------------------------");
	
	PositiveOrNegative pos = new PositiveOrNegative(-4);
	
	System.out.println("-----------------------------------------------------------");
	
	MaxOfThreeNo max  = new MaxOfThreeNo();
}
}