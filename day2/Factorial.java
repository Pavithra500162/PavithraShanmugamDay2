package week1.day2;

public class Factorial {

	public int calc(int number)
	{	
		int fact=1;
		for (int i = 1; i <= number; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number "+number+" is "+fact);
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f1=new Factorial();;
		f1.calc(5);;
		
		}
		
	}


