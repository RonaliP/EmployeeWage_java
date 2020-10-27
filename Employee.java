import java.util.*;

public class Employee{

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM ON MASTER BRANCH");
		Employee e=new Employee();
		e.check();
	}



	public void check()
	{
		 Random r=new Random();
                int random=r.nextInt(2);

	 	if(random==1)
                {
                        System.out.println("EMPLOYEE IS PRESENT TODAY");
			System.out.println("Wage/Hr=20 and Fulldayhours=8");
			int wage=20*8;
			System.out.println("WAGE WILL BE="+ wage);
                }
                else
                {
                        System.out.println("EMPLOYEE IS ABSENT TODAY");
                }

		
	}



}
