package week1.day2;

public class PositiveOrNegative {
static int number=-40;
public int check(int number)
{
	if(number<0)
	{
		System.out.println("Number is Negative: "+number);	
	}
	else
	{
		System.out.println("Number is positive: "+number);
	}
	return number;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveOrNegative p1=new PositiveOrNegative();;
		p1.check(number);
	}

}
