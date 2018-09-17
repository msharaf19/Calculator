
public class CalculatorMain {

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		calc.add(2, 4);
		
		//System.out.println(calc.add(2, 4));

		int num5 = 10;
		int num6 = 6;
		
		calc.sub(num5, num6);
		
		System.out.print("The difference between " + num5 + " and " + num6 + " is " + calc.sub(num5, num6));

	}

}
