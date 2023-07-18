package week1.day2;

public class Mobile {

	public void sendsms()
	{
		System.out.println("From OPPO");
	}
	
	public long makecall(long phno)
	{
		System.out.println("Printing Phone number");
		return phno;
	}
	public static void main(String[] args) {
	Mobile m1=new Mobile();
	m1.sendsms();
	m1.makecall(7512369456l);
	
	}
	
}

