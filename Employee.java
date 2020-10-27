import java.util.*;

public class Employee{

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM ON MASTER BRANCH");
		Random r=new Random();
		int random=r.nextInt(2);
		System.out.println(random);

		if(random==1)
		{
			System.out.println("EMPLOYEE IS PRESENT TODAY");
		}
		else
		{
			System.out.println("EMPLOYEE IS ABSENT TODAY");
		}

	}
}
