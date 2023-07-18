package week1.day2;

public class PositiveToNegative {
	static int number=-40;
	public void check()
	{
		if(number<0)
		{
			System.out.println("Given number is Negative: "+number);
			int num= (-number);
			System.out.println("Coverted positive number is "+num);
		}
		else
		{
			System.out.println("Number given is already positive: "+number);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveToNegative n1=new PositiveToNegative();
		n1.check();
	}

}
