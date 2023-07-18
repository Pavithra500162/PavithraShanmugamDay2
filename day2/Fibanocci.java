package week1.day2;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8, firstnum=0, secondnum=1, sum=0;
		System.out.println(firstnum+"\n"+secondnum);
		for (int i = 2; i<range; i++) 
		{
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}
		
	}

}
