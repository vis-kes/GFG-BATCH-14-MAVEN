package Mypkg;

public class MyCalculator {
	public int sum(int a, int b) 
	{
		return a+b;	
	}
	public int diff(int a, int b) 
	{
		return a-b;	
	}
	public int mul(int a, int b) 
	{
		return a*b;	
	}
	public int div(int a, int b) 
	{
		return a/b;	
	}
	public void display() 
	{
		System.out.println("Hello GFG 14");
	}
	public void greetings() 
	{
		System.out.println("Hello Github");
	}

	public static void main(String[] args) {

		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is :"+calc.sum(20, 10));
		System.out.println("Diff is :"+calc.diff(20, 10));
		System.out.println("Mul is :"+calc.mul(20, 10));
		System.out.println("Div is :"+calc.div(20, 10));
		System.out.println("Hello GFG 14");
		System.out.println("Hello Github");
		
		

	}

}
